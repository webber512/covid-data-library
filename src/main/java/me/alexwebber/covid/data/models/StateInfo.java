package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class StateInfo {

	String state;
	String name;
	String covid19SiteOld;
	String covid19Site;
	String covid19SiteSecondary;
	String twitter;
	String pui;
	boolean pum;
	String notes;
	String fips;

	public String getState() {
		return state;
	}

	public String getName() {
		return name;
	}

	public String getCovid19SiteOld() {
		return covid19SiteOld;
	}

	public String getCovid19Site() {
		return covid19Site;
	}

	public String getCovid19SiteSecondary() {
		return covid19SiteSecondary;
	}

	public String getTwitter() {
		return twitter;
	}

	public String getPui() {
		return pui;
	}

	public boolean isPum() {
		return pum;
	}

	public String getNotes() {
		return notes;
	}

	public String getFips() {
		return fips;
	}

}
