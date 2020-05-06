package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class CDCData {

	String dateCollected;
	Integer cdcLabs;
	Integer usPublicHealthLabs;
	Integer dailyTotal;
	Integer lag;

	public String getDateCollected() {
		return dateCollected;
	}

	public Integer getCdcLabs() {
		return cdcLabs;
	}

	public Integer getUsPublicHealthLabs() {
		return usPublicHealthLabs;
	}

	public Integer getDailyTotal() {
		return dailyTotal;
	}

	public Integer getLag() {
		return lag;
	}

}
