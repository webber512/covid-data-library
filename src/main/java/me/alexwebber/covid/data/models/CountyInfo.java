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

}
