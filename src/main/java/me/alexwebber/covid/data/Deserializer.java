package me.alexwebber.covid.data;

import com.google.gson.Gson;

import me.alexwebber.covid.data.models.BasicData;
import me.alexwebber.covid.data.models.BasicHistoricalData;
import me.alexwebber.covid.data.models.StateData;

public class Deserializer {

	private final static Gson gson = new Gson();

	public static BasicData toBasicDataAsOfToday(String json) {
		BasicData[] data = gson.fromJson(json, BasicData[].class);
		return data[0];
	}

	public static BasicHistoricalData[] toBasicHistoricalDataAllTime(String json) {
		BasicHistoricalData[] data = gson.fromJson(json, BasicHistoricalData[].class);
		return data;
	}

	public static BasicHistoricalData toBasicHistoricalDataForDate(String json) {
		BasicHistoricalData data = gson.fromJson(json, BasicHistoricalData.class);
		return data;
	}

	public static StateData[] toStateDataAsOfToday(String json) {
		StateData[] data = gson.fromJson(json, StateData[].class);
		return data;
	}

	public static StateData toStateDataForStateAsOfToday(String json) {
		StateData data = gson.fromJson(json, StateData.class);
		return data;
	}

}
