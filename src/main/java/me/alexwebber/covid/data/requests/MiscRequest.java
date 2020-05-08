package me.alexwebber.covid.data.requests;

import java.io.IOException;
import java.util.List;

import me.alexwebber.covid.data.Deserializer;
import me.alexwebber.covid.data.models.CDCData;
import me.alexwebber.covid.data.models.ScreenshotInfo;
import me.alexwebber.covid.data.models.TrackerInfo;

public class MiscRequest {
	private DataRequest covid;

	public MiscRequest(DataRequest dataRequest) {
		covid = dataRequest;
	}

	public List<CDCData> getAllCDCData() throws IOException {
		String directory = "/cdc/daily.json";
		return Deserializer.toCDCDataArray(covid.getDataCovid(directory).getJson());
	}

	public List<TrackerInfo> getAllUrls() throws IOException {
		String directory = "/urls.json";
		return Deserializer.toURLDataArray(covid.getDataCovid(directory).getJson());
	}

	public List<ScreenshotInfo> getAllScreenshots() throws IOException {
		String directory = "/states/screenshots.json";
		return Deserializer.toScreenshotInfoArray(covid.getDataCovid(directory).getJson());
	}
}
