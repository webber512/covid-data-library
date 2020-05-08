package me.alexwebber.covid.data.models;

import lombok.Value;

/**
 * The BasicData class contains fields for the BasicData schema from The COVID
 * Tracking Project
 * 
 * @author Alex Webber
 * @version 1.0
 * @since 2020-05-05
 */
@Value
public class BasicData {

	/**
	 * The number of positive cases
	 */
	Integer positive;
	/**
	 * The number of negative cases
	 */
	Integer negative;
	/**
	 * The number of pending cases
	 */
	Integer pending;
	/**
	 * The number of people currently hospitalized
	 */
	Integer hospitalizedCurrently;
	/**
	 * The number of people hospitalized at any point
	 */
	Integer hospitalizedCumulative;
	/**
	 * The number of people currently in the ICU
	 */
	Integer inIcuCurrently;
	/**
	 * The number of people in the ICU at any point
	 */
	Integer inIcuCumulative;
	/**
	 * The number of people currently on a ventilator
	 */
	Integer onVentilatorCurrently;
	/**
	 * The number of people on a ventilator at any point
	 */
	Integer onVentilatorCumulative;
	/**
	 * The number of people who have recovered
	 */
	Integer recovered;
	/**
	 * A unique hash updating each time the data is updated
	 */
	String hash;
	/**
	 * The time the data was last modified
	 */
	String lastModified;
	/**
	 * The number of deaths from the virus
	 */
	Integer death;
	/**
	 * The number of people hospitalized from the virus
	 */
	Integer hospitalized;
	/**
	 * The total number of cases
	 */
	@Deprecated
	Integer total;
	/**
	 * The total number of cases
	 */
	Integer totalTestResults;
	/**
	 * The total number of positive/negative cases
	 */
	@Deprecated
	Integer posNeg;
	/**
	 * The notes associated with the Basic Data object
	 */
	String notes;

	/**
	 * A function to get the number of positive tests
	 * 
	 * @return the positive number of tests
	 */
	public Integer getPositive() {
		return positive;
	}

	/**
	 * A function to get the number of negative cases
	 * 
	 * @return the negative number of cases
	 */
	public Integer getNegative() {
		return negative;
	}

	/**
	 * A function to get the number of pending cases
	 * 
	 * @return the pending number of cases
	 */
	public Integer getPending() {
		return pending;
	}

	/**
	 * A function to get the number of people currently hospitalized
	 * 
	 * @return the number of people currently hospitalized
	 */
	public Integer getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	/**
	 * A function to get the number of people hospitalized at any time
	 * 
	 * @return the number of people who have been hospitalized at any time
	 */
	public Integer getHospitalizedCumulative() {
		return hospitalizedCumulative;
	}

	/**
	 * A function to get the number of people currently in the ICU
	 * 
	 * @return the number of people currently in the ICU
	 */
	public Integer getInIcuCurrently() {
		return inIcuCurrently;
	}

	/**
	 * A function to get the number of people in the ICU at any time
	 * 
	 * @return the number of people in the ICU at any time
	 */
	public Integer getInIcuCumulative() {
		return inIcuCumulative;
	}

	/**
	 * A function to get the number of people currently on a ventilator
	 * 
	 * @return the number of people currently on a ventilator
	 */
	public Integer getOnVentilatorCurrently() {
		return onVentilatorCurrently;
	}

	/**
	 * A function to get the number of people on a ventilator at any time
	 * 
	 * @return the cumulative number of people on ventilators
	 */
	public Integer getOnVentilatorCumulative() {
		return onVentilatorCumulative;
	}

	/**
	 * A function to get the number of people who have recovered
	 * 
	 * @return the number people who have recovered from the virus
	 */
	public Integer getRecovered() {
		return recovered;
	}

	/**
	 * A function to get the unique hash associated with the data
	 * 
	 * @return the hash associated with the data
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * A function to get the last modified time
	 * 
	 * @return the lastModified time of the data
	 */
	public String getLastModified() {
		return lastModified;
	}

	/**
	 * A function to get the total number of deaths
	 * 
	 * @return the death count from the virus
	 */
	public Integer getDeath() {
		return death;
	}

	/**
	 * A function to get the number of hospitalizations
	 * 
	 * @return the hospitalized count
	 */
	public Integer getHospitalized() {
		return hospitalized;
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
	 * A function to get the total number of tests with results
	 * 
	 * @return the totalTestResults
	 */
	public Integer getTotalTestResults() {
		return totalTestResults;
	}

	/**
	 * A function to get the total positive/negative count
	 * 
	 * @return the posNeg count
	 */
	public Integer getPosNeg() {
		return posNeg;
	}

	/**
	 * A function to get the notes
	 * 
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

}
