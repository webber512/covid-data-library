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
}
