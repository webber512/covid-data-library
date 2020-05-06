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

}
