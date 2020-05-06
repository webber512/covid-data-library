package me.alexwebber.covid.data;

import me.alexwebber.covid.data.requests.BasicDataRequest;
import me.alexwebber.covid.data.requests.DataRequest;

public class COVIDData {

	public final DataRequest dataRequest;

	public final BasicDataRequest basicDataRequest;

	public COVIDData() {
		dataRequest = new DataRequest();
		basicDataRequest = new BasicDataRequest(dataRequest);
	}
}
