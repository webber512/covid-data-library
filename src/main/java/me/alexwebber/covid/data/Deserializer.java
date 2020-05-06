package me.alexwebber.covid.data;

import com.google.gson.Gson;

import me.alexwebber.covid.data.models.BasicData;

public class Deserializer {

	private final static Gson gson = new Gson();

	public static BasicData[] toBasicDataArray(String jsonData) {
		BasicData[] data = gson.fromJson(jsonData, BasicData[].class);
		return data;
	}

}
