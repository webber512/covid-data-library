package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class BasicData {

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
}
