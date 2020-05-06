package me.alexwebber.covid.data.requests;

import lombok.Value;

@Value
public class APIResponse {

	String json;
	String lastModified;
	int responseCode;

	public APIResponse(String jsonContent, String lastModified, int responseCode) {
		this.json = jsonContent;
		this.lastModified = lastModified;
		this.responseCode = responseCode;
	}
}
