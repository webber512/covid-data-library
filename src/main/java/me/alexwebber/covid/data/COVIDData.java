package me.alexwebber.covid.data;

import me.alexwebber.covid.data.requests.USDataRequest;
import me.alexwebber.covid.data.requests.DataRequest;
import me.alexwebber.covid.data.requests.StateDataRequest;

public class COVIDData {

	public final DataRequest dataRequest;

	public final USDataRequest USDataRequest;

	public final StateDataRequest StateDataRequest;

	public COVIDData() {
		dataRequest = new DataRequest();
		USDataRequest = new USDataRequest(dataRequest);
		StateDataRequest = new StateDataRequest(dataRequest);
	}
}
