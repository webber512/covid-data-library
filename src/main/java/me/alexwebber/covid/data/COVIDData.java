package me.alexwebber.covid.data;

import me.alexwebber.covid.data.requests.USDataRequest;
import me.alexwebber.covid.data.requests.DataRequest;

public class COVIDData {

	public final DataRequest dataRequest;

	public final USDataRequest USDataRequest;

	public COVIDData() {
		dataRequest = new DataRequest();
		USDataRequest = new USDataRequest(dataRequest);
	}
}
