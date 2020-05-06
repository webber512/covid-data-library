package me.alexwebber.covid.data.models;

import lombok.Value;

/**
 * The USData class contains fields for the USData schema from The COVID
 * Tracking Project
 * 
 * @author Alex Webber
 * @version 1.0
 * @since 2020-05-05
 */
@Value
public class USData {
	/**
	 * Total cumulative positive tests
	 */
	Integer positive;
	/**
	 * Total cumulative negative tests
	 */
	Integer negative;
	/**
	 * Number of pending tests (no results currently)
	 */
	Integer pending;
	/**
	 * Number of persons currently hospitalized.
	 */
	Integer hospitalizedCurrently;
	/**
	 * Number of persons hospitalized at some point
	 */
	Integer hospitalizedCumulative;
	/**
	 * Number of persons currently in the ICU
	 */
	Integer inIcuCurrently;
	/**
	 * Number of persons in the ICU at some point
	 */
	Integer inIcuCumulative;
	/**
	 * Number of persons currently on a ventilator
	 */
	Integer onVentilatorCurrently;
	/**
	 * Number of persons who were on a ventilator at some point
	 */
	Integer onVentilatorCumulative;
	/**
	 * Number of recovered persons
	 */
	Integer recovered;
	/**
	 * A unique ID changed every time the data is updated
	 */
	String hash;
	/**
	 * The date the last API was updated
	 */
	String lastMotified;
	/**
	 * Total cumulative number of deaths
	 */
	Integer death;
	/**
	 * Total number of people hospitalized
	 */
	Integer hospitalized;
	/**
	 * Positive + negative + pending
	 */
	@Deprecated
	Integer total;
	/**
	 * Positive + Negative test results
	 */
	Integer totalTestResults;
	/**
	 * Notes about current US data
	 */
	String notes;

	/**
	 * A function to get the number of positive cases
	 * 
	 * @return number of positive cases
	 */
	public Integer getPositive() {
		return positive;
	}

	/**
	 * A function to get the number of negative cases
	 * 
	 * @return number of negative cases
	 */
	public Integer getNegative() {
		return negative;
	}

	/**
	 * A function to get the number of pending cases
	 * 
	 * @return number of pending cases
	 */
	public Integer getPending() {
		return pending;
	}

	/**
	 * A function to get the number of currently hospitalized
	 * 
	 * @return the number of currently hospitalized people
	 */
	public Integer getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	/**
	 * A function to get the number of people hospitalized at any time
	 * 
	 * @return the number of total hospitalized people
	 */
	public Integer getHospitalizedCumulative() {
		return hospitalizedCumulative;
	}

	/**
	 * A function to get the number of people currently in the ICU
	 * 
	 * @return the number of people in the ICU
	 */
	public Integer getInIcuCurrently() {
		return inIcuCurrently;
	}

	/**
	 * A function to get the number of people in the ICU of all time
	 * 
	 * @return the number of people in the ICU at any time
	 */
	public Integer getInIcuCumulative() {
		return inIcuCumulative;
	}

	/**
	 * A function to get the number of people on a ventilator currently
	 * 
	 * @return The number of people currently on ventilators
	 */
	public Integer getOnVentilatorCurrently() {
		return onVentilatorCurrently;
	}

	/**
	 * A function to get the number of people on a ventilator of all time
	 * 
	 * @return the number of people who have been on a ventilator
	 */
	public Integer getOnVentilatorCumulative() {
		return onVentilatorCumulative;
	}

	/**
	 * A function to get the number of people who have recovered
	 * 
	 * @return the number of recovered people
	 */
	public Integer getRecovered() {
		return recovered;
	}

	/**
	 * A unique hash, updated each time the data is changed
	 * 
	 * @return The hash of the data set
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * A function to get the last modified time
	 * 
	 * @return the last modified time of the data
	 */
	public String getLastMotified() {
		return lastMotified;
	}

	/**
	 * A function to get the number of total deaths
	 * 
	 * @return the number of deaths
	 */
	public Integer getDeath() {
		return death;
	}

	/**
	 * A function to get the total number of tests
	 * 
	 * @return the total number of tests
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * A function to get the total number of results with tests
	 * 
	 * @return the total number of tests with results
	 */
	public Integer getTotalTestResults() {
		return totalTestResults;
	}

	/**
	 * A function to get notes associated with the data
	 * 
	 * @return notes associated with the data
	 */
	public String getNotes() {
		return notes;
	}
}
