package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class USData {
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
	String lastMotified;
	Integer death;
	@Deprecated
	Integer total;
	Integer totalTestResults;
	@Deprecated
	Integer posNeg;
	String notes;

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

	public String getLastMotified() {
		return lastMotified;
	}

	public Integer getDeath() {
		return death;
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
}
