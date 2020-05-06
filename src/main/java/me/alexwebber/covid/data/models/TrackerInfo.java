package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class TrackerInfo {

	String name;
	String stateId;
	String url;
	String kind;
	String filter;

}
