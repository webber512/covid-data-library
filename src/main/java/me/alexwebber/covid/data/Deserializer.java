package me.alexwebber.covid.data;

import com.google.gson.Gson;

import me.alexwebber.covid.data.models.BasicData;
import me.alexwebber.covid.data.models.BasicHistoricalData;
import me.alexwebber.covid.data.models.CDCData;
import me.alexwebber.covid.data.models.CountyInfo;
import me.alexwebber.covid.data.models.ScreenshotInfo;
import me.alexwebber.covid.data.models.StateData;
import me.alexwebber.covid.data.models.StateHistoricalData;
import me.alexwebber.covid.data.models.StateInfo;
import me.alexwebber.covid.data.models.TrackerInfo;

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

	public static StateHistoricalData[] toStateDataAllTimeForStates(String json) {
		StateHistoricalData[] data = gson.fromJson(json, StateHistoricalData[].class);
		return data;
	}

	public static StateHistoricalData[] toStateDataAllTimeForState(String json) {
		StateHistoricalData[] data = gson.fromJson(json, StateHistoricalData[].class);
		return data;
	}

	public static StateHistoricalData toStateDataForStateAndDate(String json) {
		StateHistoricalData data = gson.fromJson(json, StateHistoricalData.class);
		return data;
	}

	public static StateInfo[] toStateInfo(String json) {
		StateInfo[] data = gson.fromJson(json, StateInfo[].class);
		return data;
	}

	public static CountyInfo[] toCountyArray(String json) {
		CountyInfo[] data = gson.fromJson(json, CountyInfo[].class);
		return data;
	}

	public static CDCData[] toCDCDataArray(String json) {
		CDCData[] data = gson.fromJson(json, CDCData[].class);
		return data;
	}

	public static TrackerInfo[] toURLDataArray(String json) {
		TrackerInfo[] data = gson.fromJson(json, TrackerInfo[].class);
		return data;
	}

	public static ScreenshotInfo[] toScreenshotInfoArray(String json) {
		ScreenshotInfo[] data = gson.fromJson(json, ScreenshotInfo[].class);
		return data;
	}

}
