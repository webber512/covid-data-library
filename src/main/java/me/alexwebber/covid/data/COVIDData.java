package me.alexwebber.covid.data;

import me.alexwebber.covid.data.requests.USRequest;
import me.alexwebber.covid.data.requests.MiscRequest;
import me.alexwebber.covid.data.requests.CountyRequest;
import me.alexwebber.covid.data.requests.DataRequest;
import me.alexwebber.covid.data.requests.StateRequest;

public class COVIDData {

	public final DataRequest dataRequest;

	public final USRequest us;

	public final StateRequest state;

	public final CountyRequest county;
	
	public final MiscRequest misc;

	public COVIDData() {
		dataRequest = new DataRequest();
		us = new USRequest(dataRequest);
		state = new StateRequest(dataRequest);
		county = new CountyRequest(dataRequest);
		misc = new MiscRequest(dataRequest);
	}
}
