package me.alexwebber.covid.data.models;

import lombok.Value;

/**
 * The USHistoricalData class contains fields for the USHistoricalData schema
 * from The COVID Tracking Project
 * 
 * @author Alex Webber
 * @version 1.0
 * @since 2020-05-05
 */
@Value
public class USHistoricalData {

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
	 * Number of people currently hospitalized
	 */
	Integer hospitalizedCurrently;
	/**
	 * Number of people hospitalized at some point
	 */
	Integer hospitalizedCumulative;
	/**
	 * Number of people currently in the ICU
	 */
	Integer inIcuCurrently;
	/**
	 * Number of people in the ICU at some point
	 */
	Integer inIcuCumulative;
	/**
	 * Number of people currently on a ventilator
	 */
	Integer onVentilatorCurrently;
	/**
	 * Number of people on a ventilator at some point
	 */
	Integer onVentilatorCumulative;
	/**
	 * Number of people who have recovered
	 */
	Integer recovered;
	/**
	 * A unique ID changed every time the data is updated
	 */
	String hash;
	/**
	 * The date the API was last updated
	 */
	String lastModified;
	/**
	 * Total number of deaths
	 */
	Integer death;
	/**
	 * Total number of hospitalizations
	 */
	Integer hospitalized;
	/**
	 * Positive + negative + pending (deprecated)
	 */
	@Deprecated
	Integer total;
	/**
	 * Positive + negative tests
	 */
	Integer totalTestResults;
	/**
	 * Positive + negative tests (deprecated)
	 */
	@Deprecated
	Integer posNeg;
	/**
	 * Notes about the data
	 */
	String notes;
	/**
	 * The date the object represents
	 */
	Integer date;
	/**
	 * The number of additional deaths from the previous day
	 */
	Integer deathIncrease;
	/**
	 * The number of additional hospitalizations from the previous day
	 */
	Integer hospitalizedIncrease;
	/**
	 * The number of negative tests increased from the previous day
	 */
	Integer negativeIncrease;
	/**
	 * The number of positive tests increased from the previous day
	 */
	Integer positiveIncrease;
	/**
	 * The number of total tests increased from the previous day
	 */
	Integer totalTestResultsIncrease;
	/**
	 * The last time the data was updated
	 */
	String lastUpdateEt;
	/**
	 * A grade for the state's data quality
	 */
	String dataQualityGrade;
	/**
	 * Number of states reporting data
	 */
	Integer states;
	/**
	 * The date the values were valdi.
	 */
	String dateChecked;

	/**
	 * A function to get the number of positive cases
	 * 
	 * @return the positive number of cases
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
	 * @return the number of people currently hospitalized.
	 */
	public Integer getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	/**
	 * A function to get the number of people who have been hospitalized
	 * 
	 * @return the cumulative number of hospitalizations
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
	 * A function to get the number of people who have been in the ICU
	 * 
	 * @return the total number of people requiring admittance in the ICU
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
	 * A function to get the number of people who have needed a ventilator
	 * 
	 * @return the number of total people who have needed a ventilator.
	 */
	public Integer getOnVentilatorCumulative() {
		return onVentilatorCumulative;
	}

	/**
	 * A function to get the number of people who have recovered
	 * 
	 * @return the number of total recoveries
	 */
	public Integer getRecovered() {
		return recovered;
	}

	/**
	 * A function to get a unique hash of the data
	 * 
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * A function to get the last modified date of the data
	 * 
	 * @return the lastModified date of the data
	 */
	public String getLastModified() {
		return lastModified;
	}

	/**
	 * A function to get number of total deaths
	 * 
	 * @return the total number of deaths
	 */
	public Integer getDeath() {
		return death;
	}

	/**
	 * A function to get the total number of currently hospitalized
	 * 
	 * @return the number of people currently hospitalized
	 */
	public Integer getHospitalized() {
		return hospitalized;
	}

	/**
	 * A function to get the total number (Positive + Negative + Pending)
	 * 
	 * @return the total number of tests
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * A function to get the total number of tests results
	 * 
	 * @return the total number of tests
	 */
	public Integer getTotalTestResults() {
		return totalTestResults;
	}

	/**
	 * A function to get the total number of Positive/Negative tests
	 * 
	 * @return the pos + negative number of tests
	 */
	public Integer getPosNeg() {
		return posNeg;
	}

	/**
	 * A function to get notes associated with the data
	 * 
	 * @return the notes associated with the data
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * A function to get the date of the data
	 * 
	 * @return the date of the data
	 */
	public Integer getDate() {
		return date;
	}

	/**
	 * A function to get the increase in deaths compared to the prior day
	 * 
	 * @return the deathIncrease that day
	 */
	public Integer getDeathIncrease() {
		return deathIncrease;
	}

	/**
	 * A function to get the increase in hospitalizations compared to the prior day
	 * 
	 * @return the hospitalizedIncrease that day
	 */
	public Integer getHospitalizedIncrease() {
		return hospitalizedIncrease;
	}

	/**
	 * A function to get the increase in negative tests compared to the prior day
	 * 
	 * @return the negativeIncrease in test results that day
	 */
	public Integer getNegativeIncrease() {
		return negativeIncrease;
	}

	/**
	 * A function to get the increase in positive tests compared to the prior day
	 * 
	 * @return the positiveIncrease in test results that day
	 */
	public Integer getPositiveIncrease() {
		return positiveIncrease;
	}

	/**
	 * A function to get the total test results increase in tests compared to the
	 * prior day
	 * 
	 * @return the totalTestResultsIncrease in results that day
	 */
	public Integer getTotalTestResultsIncrease() {
		return totalTestResultsIncrease;
	}

	/**
	 * A function to get the last updated time of the data
	 * 
	 * @return the time the data was last updated
	 */
	public String getLastUpdateEt() {
		return lastUpdateEt;
	}

	/**
	 * A function to get the overall quality of the data, measured in A,B,C,D,F
	 * 
	 * @return the dataQualityGrade corresponding with the data avaliable
	 */
	public String getDataQualityGrade() {
		return dataQualityGrade;
	}

	/**
	 * A function to get the number of states reporting data
	 * 
	 * @return the number of states reporting data.
	 */
	public Integer getStates() {
		return states;
	}

	/**
	 * A function to get the date that this data was checked
	 * 
	 * @return the date the data was checked
	 */
	public String getDateChecked() {
		return dateChecked;
	}

}
