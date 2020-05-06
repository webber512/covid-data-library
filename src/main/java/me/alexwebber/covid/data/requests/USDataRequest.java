package me.alexwebber.covid.data.requests;

import java.io.IOException;

import me.alexwebber.covid.data.Deserializer;
import me.alexwebber.covid.data.models.BasicData;
import me.alexwebber.covid.data.models.BasicHistoricalData;

public class USDataRequest {

	private DataRequest covid;

	public USDataRequest(DataRequest dataRequest) {
		covid = dataRequest;
	}

	public BasicData getBasicDataAsOfToday() throws IOException {
		String directory = "/us/current.json";
		return Deserializer.toBasicDataAsOfToday(covid.getDataCovid(directory).json);

	}

	public BasicHistoricalData[] getBasicHistoricalDataAllTime() throws IOException {
		String directory = "/us/daily.json";
		return Deserializer.toBasicHistoricalDataAllTime(covid.getDataCovid(directory).json);
	}

	public BasicHistoricalData getBasicHistoricalDataForDate(String date) throws IOException {
		String directory = "/us/" + date + ".json";
		return Deserializer.toBasicHistoricalDataForDate(covid.getDataCovid(directory).json);
	}

}
