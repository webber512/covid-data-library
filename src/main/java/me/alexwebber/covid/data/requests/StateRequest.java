package me.alexwebber.covid.data.requests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import me.alexwebber.covid.data.Deserializer;
import me.alexwebber.covid.data.models.StateData;
import me.alexwebber.covid.data.models.StateHistoricalData;
import me.alexwebber.covid.data.models.StateInfo;
import me.alexwebber.covid.data.objects.StateListObject;

public class StateRequest {

	private DataRequest covid;

	public StateRequest(DataRequest dataRequest) {
		covid = dataRequest;
	}

	public List<StateData> getDataAsOfToday() throws IOException {
		String directory = "/states/current.json";
		return Deserializer.toStateDataAsOfToday(covid.getDataCovid(directory).getJson());
	}

	public StateData getDataForStateAsOfToday(String state) throws IOException {
		String directory = "/states/" + state + "/current.json";
		return Deserializer.toStateDataForStateAsOfToday(covid.getDataCovid(directory).getJson());
	}

	public List<StateHistoricalData> getDataAllTimeForStates() throws IOException {
		String directory = "/states/daily.json";
		return Deserializer.toStateDataAllTimeForStates(covid.getDataCovid(directory).getJson());
	}

	public List<StateHistoricalData> getDataAllTimeForState(String state) throws IOException {
		String directory = "/states/" + state + "/daily.json";
		return Deserializer.toStateDataAllTimeForState(covid.getDataCovid(directory).getJson());
	}

	public StateHistoricalData getDataForStateOn(String state, String date) throws IOException {
		String directory = "/states/" + state + "/" + date + ".json";
		return Deserializer.toStateDataForStateAndDate(covid.getDataCovid(directory).getJson());
	}

	public List<StateInfo> getStateInfo() throws IOException {
		String directory = "/states/info.json";
		return Deserializer.toStateInfo(covid.getDataCovid(directory).getJson());
	}

	public List<StateListObject> getStates() throws IOException {
		List<StateInfo> stateInfoList = getStateInfo();
		List<StateListObject> states = new ArrayList<>();

		for (StateInfo s : stateInfoList) {
			states.add(new StateListObject(s.getState(), s.getName()));
		}

		return states;
	}
}
