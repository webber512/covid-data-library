package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class BasicData {

	/**
	 * 
	 */
	Integer positive;
	/**
	 * 
	 */
	Integer negative;
	/**
	 * 
	 */
	Integer pending;
	/**
	 * 
	 */
	Integer hospitalizedCurrently;
	/**
	 * 
	 */
	Integer hospitalizedCumulative;
	/**
	 * 
	 */
	Integer inIcuCurrently;
	/**
	 * 
	 */
	Integer inIcuCumulative;
	/**
	 * 
	 */
	Integer onVentilatorCurrently;
	/**
	 * 
	 */
	Integer onVentilatorCumulative;
	/**
	 * 
	 */
	Integer recovered;
	/**
	 * 
	 */
	String hash;
	/**
	 * 
	 */
	String lastModified;
	/**
	 * 
	 */
	Integer death;
	/**
	 * 
	 */
	Integer hospitalized;
	/**
	 * 
	 */
	@Deprecated
	Integer total;
	/**
	 * 
	 */
	Integer totalTestResults;
	/**
	 * 
	 */
	@Deprecated
	Integer posNeg;
	/**
	 * 
	 */
	String notes;

	/**
	 * @return
	 */
	public Integer getPositive() {
		return positive;
	}

	/**
	 * @return
	 */
	public Integer getNegative() {
		return negative;
	}

	/**
	 * @return
	 */
	public Integer getPending() {
		return pending;
	}

	/**
	 * @return
	 */
	public Integer getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	/**
	 * @return
	 */
	public Integer getHospitalizedCumulative() {
		return hospitalizedCumulative;
	}

	/**
	 * @return
	 */
	public Integer getInIcuCurrently() {
		return inIcuCurrently;
	}

	/**
	 * @return
	 */
	public Integer getInIcuCumulative() {
		return inIcuCumulative;
	}

	/**
	 * @return
	 */
	public Integer getOnVentilatorCurrently() {
		return onVentilatorCurrently;
	}

	/**
	 * @return
	 */
	public Integer getOnVentilatorCumulative() {
		return onVentilatorCumulative;
	}

	/**
	 * @return
	 */
	public Integer getRecovered() {
		return recovered;
	}

	/**
	 * @return
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * @return
	 */
	public String getLastModified() {
		return lastModified;
	}

	/**
	 * @return
	 */
	public Integer getDeath() {
		return death;
	}

	/**
	 * @return
	 */
	public Integer getHospitalized() {
		return hospitalized;
	}

	/**
	 * @return
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @return
	 */
	public Integer getTotalTestResults() {
		return totalTestResults;
	}

	/**
	 * @return
	 */
	public Integer getPosNeg() {
		return posNeg;
	}

	/**
	 * @return
	 */
	public String getNotes() {
		return notes;
	}
}
