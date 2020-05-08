package me.alexwebber.covid.data.models;

import lombok.Value;

/**
 * The BasicHistoricalData class contains fields for the BasicHistoricalData
 * schema from The COVID Tracking Project
 * 
 * @author Alex Webber
 * @version 1.0
 * @since 2020-05-05
 */
@Value
public class BasicHistoricalData {

	Integer positive;
	Integer negative;
	Integer pending;
	Integer hospitalizedCurrently;
	Integer hospitalizedCumulative;
	Integer inIcuCurrently;
	Integer inIcuCumulative;
	Integer onVentilatorCurrently;
	Integer onVentilatorCumulative;
	Integer recovered;
	String hash;
	String lastModified;
	Integer death;
	Integer hospitalized;
	@Deprecated
	Integer total;
	Integer totalTestResults;
	@Deprecated
	Integer posNeg;
	String notes;
	Integer date;
	Integer deathIncrease;
	Integer hospitalizedIncrease;
	Integer negativeIncrease;
	Integer positiveIncrease;
	Integer totalTestResultsIncrease;
	String lastUpdateEt;
	String dataQualityGrade;

	public Integer getPositive() {
		return positive;
	}

	public Integer getNegative() {
		return negative;
	}

	public Integer getPending() {
		return pending;
	}

	public Integer getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	public Integer getHospitalizedCumulative() {
		return hospitalizedCumulative;
	}

	public Integer getInIcuCurrently() {
		return inIcuCurrently;
	}

	public Integer getInIcuCumulative() {
		return inIcuCumulative;
	}

	public Integer getOnVentilatorCurrently() {
		return onVentilatorCurrently;
	}

	public Integer getOnVentilatorCumulative() {
		return onVentilatorCumulative;
	}

	public Integer getRecovered() {
		return recovered;
	}

	public String getHash() {
		return hash;
	}

	public String getLastModified() {
		return lastModified;
	}

	public Integer getDeath() {
		return death;
	}

	public Integer getHospitalized() {
		return hospitalized;
	}

	public Integer getTotal() {
		return total;
	}

	public Integer getTotalTestResults() {
		return totalTestResults;
	}

	public Integer getPosNeg() {
		return posNeg;
	}

	public String getNotes() {
		return notes;
	}

	public Integer getDate() {
		return date;
	}

	public Integer getDeathIncrease() {
		return deathIncrease;
	}

	public Integer getHospitalizedIncrease() {
		return hospitalizedIncrease;
	}

	public Integer getNegativeIncrease() {
		return negativeIncrease;
	}

	public Integer getPositiveIncrease() {
		return positiveIncrease;
	}

	public Integer getTotalTestResultsIncrease() {
		return totalTestResultsIncrease;
	}

	public String getLastUpdateEt() {
		return lastUpdateEt;
	}

	public String getDataQualityGrade() {
		return dataQualityGrade;
	}

}
