package me.alexwebber.covid.data.requests;

import java.io.IOException;

import me.alexwebber.covid.data.Deserializer;
import me.alexwebber.covid.data.models.StateData;

public class StateDataRequest {

	private DataRequest covid;

	public StateDataRequest(DataRequest dataRequest) {
		covid = dataRequest;
	}

	public StateData[] getDataAsOfToday() throws IOException {
		String directory = "/states/current.json";
		return Deserializer.toStateDataAsOfToday(covid.getDataCovid(directory).json);
	}

	public StateData getDataForStateAsOfToday(String state) throws IOException {
		String directory = "/states/" + state + "/current.json";
		return Deserializer.toStateDataForStateAsOfToday(covid.getDataCovid(directory).json);
	}

}
