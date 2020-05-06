package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class TrackerInfo {

	String name;
	String stateId;
	String url;
	String kind;
	String filter;

	public String getName() {
		return name;
	}

	public String getStateId() {
		return stateId;
	}

	public String getUrl() {
		return url;
	}

	public String getKind() {
		return kind;
	}

	public String getFilter() {
		return filter;
	}

}
