package me.alexwebber.covid.data.requests;

import java.io.IOException;

import me.alexwebber.covid.data.Deserializer;
import me.alexwebber.covid.data.models.StateData;
import me.alexwebber.covid.data.models.StateHistoricalData;
import me.alexwebber.covid.data.models.StateInfo;

public class StateRequest {

	private DataRequest covid;

	public StateRequest(DataRequest dataRequest) {
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

	public StateHistoricalData[] getDataAllTimeForStates() throws IOException {
		String directory = "/states/daily.json";
		return Deserializer.toStateDataAllTimeForStates(covid.getDataCovid(directory).json);
	}

	public StateHistoricalData[] getDataAllTimeForState(String state) throws IOException {
		String directory = "/states/" + state + "/daily.json";
		return Deserializer.toStateDataAllTimeForState(covid.getDataCovid(directory).json);
	}

	public StateHistoricalData getDataForStateOn(String state, String date) throws IOException {
		String directory = "/states/" + state + "/" + date + ".json";
		return Deserializer.toStateDataForStateAndDate(covid.getDataCovid(directory).json);
	}

	public StateInfo[] getStateInfo() throws IOException {
		String directory = "/states/info.json";
		return Deserializer.toStateInfo(covid.getDataCovid(directory).json);

	}
}
