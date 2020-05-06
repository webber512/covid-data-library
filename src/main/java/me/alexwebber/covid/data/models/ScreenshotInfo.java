package me.alexwebber.covid.data.models;

import lombok.Value;

@Value
public class ScreenshotInfo {

	String state;
	String url;
	String dateChecked;
	boolean secondary;
	String date;
	Integer size;

}
