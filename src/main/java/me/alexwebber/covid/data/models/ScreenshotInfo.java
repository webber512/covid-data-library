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

	public void setState(String state) {
		this.state = state;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDateChecked() {
		return dateChecked;
	}

	public void setDateChecked(String dateChecked) {
		this.dateChecked = dateChecked;
	}

	public boolean isSecondary() {
		return secondary;
	}

	public void setSecondary(boolean secondary) {
		this.secondary = secondary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}
