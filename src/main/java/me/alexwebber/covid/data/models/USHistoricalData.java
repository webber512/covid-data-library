package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class USHistoricalData {

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
	Integer states;
	String dateChecked;

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

	public Integer getStates() {
		return states;
	}

	public String getDateChecked() {
		return dateChecked;
	}
}
