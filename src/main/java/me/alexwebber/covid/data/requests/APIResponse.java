package me.alexwebber.covid.data.requests;

import lombok.Value;

@Value
public class APIResponse {

	String json;
	String lastModified;
	int responseCode;

	/**
	 * @return the json
	 */
	public String getJson() {
		return json;
	}

	/**
	 * @return the lastModified
	 */
	public String getLastModified() {
		return lastModified;
	}

	/**
	 * @return the responseCode
	 */
	public int getResponseCode() {
		return responseCode;
	}

	public APIResponse(String jsonContent, String lastModified, int responseCode) {
		this.json = jsonContent;
		this.lastModified = lastModified;
		this.responseCode = responseCode;
	}
}
