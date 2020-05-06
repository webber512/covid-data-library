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
}
