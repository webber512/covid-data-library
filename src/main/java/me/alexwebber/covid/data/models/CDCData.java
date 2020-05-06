package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class CDCData {

	String dateCollected;
	Integer cdcLabs;
	Integer usPublicHealthLabs;
	Integer dailyTotal;
	Integer lag;

}
