package me.alexwebber.covid.data.requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import lombok.Value;

@Value
public class DataRequest {

	public static final String COVID_API_URL = "https://www.covidtracking.com/api/v1";

	public APIResponse getDataCovid(String urlDirectory) throws IOException {
		URL url;
		url = new URL(COVID_API_URL + urlDirectory);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		return getData(connection);
	}

	private APIResponse getData(HttpURLConnection connection) {
		try {
			connection.setRequestMethod("GET");
			connection.addRequestProperty("User-Agent", "Desktop");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuilder response = new StringBuilder();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return new APIResponse(response.toString(), connection.getHeaderField("Last-Modified"),
					connection.getResponseCode());

		} catch (

		IOException ex) {
			if (ex.getMessage().contains("401")) {
				return new APIResponse(null, null, 401);
			}
			if (ex.getMessage().contains("304")) {
				return new APIResponse(null, null, 304);
			}
			if (ex.getMessage().contains("404")) {
				return new APIResponse(null, null, 404);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;

	}

	public APIResponse getDataCovid(String urlDirectory, String ifModifiedSince) throws IOException {
		URL url = new URL(COVID_API_URL + urlDirectory);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		return getData(con);
	}
}
