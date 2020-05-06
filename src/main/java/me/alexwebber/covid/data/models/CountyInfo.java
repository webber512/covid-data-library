package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class CountyInfo {

	String state;
	String county;
	String covid19Site;
	String dataSite;
	String mainSite;
	String twitter;
	String pui;

	public String getState() {
		return state;
	}

	public String getCounty() {
		return county;
	}

	public String getCovid19Site() {
		return covid19Site;
	}

	public String getDataSite() {
		return dataSite;
	}

	public String getMainSite() {
		return mainSite;
	}

	public String getTwitter() {
		return twitter;
	}

	public String getPui() {
		return pui;
	}

}
