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

	public String getState() {
		return state;
	}

	public String getUrl() {
		return url;
	}

	public String getDateChecked() {
		return dateChecked;
	}

	public boolean isSecondary() {
		return secondary;
	}

	public String getDate() {
		return date;
	}

	public Integer getSize() {
		return size;
	}

}
