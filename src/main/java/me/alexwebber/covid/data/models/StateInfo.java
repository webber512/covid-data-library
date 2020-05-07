package me.alexwebber.covid.data.models;

import lombok.Value;

/**
 * The StateInfo class contains fields for the StateInfo schema from The COVID
 * Tracking Project
 * 
 * @author Alex Webber
 * @version 1.0
 * @since 2020-05-05
 */
@Value
public class StateInfo {

	/**
	 * The state abbreviation (KS)
	 */
	String state;
	/**
	 * The state name (Kansas)
	 */
	String name;
	/**
	 * The old covid site for that state
	 */
	String covid19SiteOld;
	/**
	 * The URL of the site that makes results visible to the public
	 */
	String covid19Site;
	/**
	 * A secondary site that is more informational
	 */
	String covid19SiteSecondary;
	/**
	 * The twitter handle of the state's Health Department
	 */
	String twitter;
	/**
	 * Persons under investigation
	 */
	String pui;
	/**
	 * Does the state collect the number of persons under monitoring
	 */
	boolean pum;
	/**
	 * Notes about the state
	 */
	String notes;
	/**
	 * Federal Information Processing Standard state code
	 */
	String fips;

	/**
	 * A function to get the abbreviation of the state
	 * 
	 * @return the states abbreviation
	 */
	public String getState() {
		return state;
	}

	/**
	 * A function to get the name of the state
	 * 
	 * @return the name of the state
	 */
	public String getName() {
		return name;
	}

	/**
	 * A function to get the old covid site
	 * 
	 * @return the old covid reporting site
	 */
	public String getCovid19SiteOld() {
		return covid19SiteOld;
	}

	/**
	 * A function to get the primary site URL reporting data
	 * 
	 * @return the URL of the site making data avaliable
	 */
	public String getCovid19Site() {
		return covid19Site;
	}

	/**
	 * A function to get a secondary URL of information
	 * 
	 * @return the secondary site's URL for data reporting
	 */
	public String getCovid19SiteSecondary() {
		return covid19SiteSecondary;
	}

	/**
	 * A function to get the twitter handle of the states health department
	 * 
	 * @return the twitter handle for that state
	 */
	public String getTwitter() {
		return twitter;
	}

	/**
	 * A function to get the persons under investigation
	 * 
	 * @return the persons under investigation, if done by the state
	 */
	public String getPui() {
		return pui;
	}

	/**
	 * A function to get if the state tracks persons under monitoring (pum)
	 * 
	 * @return a bool true if they track it, false if they dont
	 */
	public boolean isPum() {
		return pum;
	}

	/**
	 * A function to get the notes associated with the state
	 * 
	 * @return the notes associated with the state
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * A function to get the Federal Information Processing Code for the state
	 * 
	 * @return the fips for the state
	 */
	public String getFips() {
		return fips;
	}

}
