package me.alexwebber.covid.data.requests;

import java.io.IOException;

import me.alexwebber.covid.data.Deserializer;
import me.alexwebber.covid.data.models.BasicData;

public class BasicDataRequest {

	private DataRequest covid;

	public BasicDataRequest(DataRequest dataRequest) {
		covid = dataRequest;
	}

	public BasicData[] getCurrentDataBasic() throws IOException {
		String directory = "/us/current.json";
		return Deserializer.toBasicDataArray(covid.getDataCovid(directory).json);

	}

}
