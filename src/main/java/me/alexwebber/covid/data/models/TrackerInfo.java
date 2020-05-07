package me.alexwebber.covid.data.models;

import lombok.Value;

/**
 * The TrackerInfo class contains fields for the TrackerInfo schema from The
 * COVID Tracking Project
 * 
 * @author Alex Webber
 * @version 1.0
 * @since 2020-05-05
 */
@Value
public class TrackerInfo {

	/**
	 * The name of the state
	 */
	String name;
	/**
	 * The abbreviation of the state
	 */
	String stateId;
	/**
	 * The URL of the tracker
	 */
	String url;
	/**
	 * The type of tracker
	 */
	String kind;
	/**
	 * The filter of the tracker
	 */
	String filter;

	/**
	 * A function to get the name of the state
	 * 
	 * @return the name of the state
	 */
	public String getName() {
		return name;
	}

	/**
	 * A function to get the abbreviation of the state
	 * 
	 * @return the state's abbreviation
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * A function to get the url of the states tracking system
	 * 
	 * @return the url of the tracking system
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * A function to get the type/kind of the states tracking system
	 * 
	 * @return the kind of the tracking system
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * A function to get the filter used with the tracking system
	 * 
	 * @return the filter used
	 */
	public String getFilter() {
		return filter;
	}

}
