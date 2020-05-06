package me.alexwebber.covid.data.requests;

import java.io.IOException;
import java.util.List;

import me.alexwebber.covid.data.Deserializer;
import me.alexwebber.covid.data.models.CountyInfo;

public class CountyRequest {
	private DataRequest covid;

	public CountyRequest(DataRequest dataRequest) {
		covid = dataRequest;
	}
	
	public List<CountyInfo> getAllCounties() throws IOException {
		String directory = "/counties.json";
		return Deserializer.toCountyArray(covid.getDataCovid(directory).json);
	}
	
}
