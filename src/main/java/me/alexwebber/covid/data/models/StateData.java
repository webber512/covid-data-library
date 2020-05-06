package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class StateData {

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
	String state;
	@Deprecated
	Integer positiveScore;
	@Deprecated
	Integer negativeScore;
	@Deprecated
	Integer negativeRegularScore;
	@Deprecated
	Integer commercialScore;
	@Deprecated
	String grade;
	@Deprecated
	Integer score;
	String DataQualityGrade;
	String lastUpdateEt;
	String checkTimeEt;
	String fips;
	String dateModified;
	String dateChecked;
}
