package me.alexwebber.covid.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	public static List<BasicHistoricalData> toBasicHistoricalDataAllTime(String json) {
		BasicHistoricalData[] data = gson.fromJson(json, BasicHistoricalData[].class);
		List<BasicHistoricalData> list = new ArrayList<BasicHistoricalData>(Arrays.asList(data));
		return list;
	}

	public static BasicHistoricalData toBasicHistoricalDataForDate(String json) {
		BasicHistoricalData data = gson.fromJson(json, BasicHistoricalData.class);
		return data;
	}

	public static List<StateData> toStateDataAsOfToday(String json) {
		StateData[] data = gson.fromJson(json, StateData[].class);
		List<StateData> list = new ArrayList<StateData>(Arrays.asList(data));
		return list;
	}

	public static StateData toStateDataForStateAsOfToday(String json) {
		StateData data = gson.fromJson(json, StateData.class);
		return data;
	}

	public static List<StateHistoricalData> toStateDataAllTimeForStates(String json) {
		StateHistoricalData[] data = gson.fromJson(json, StateHistoricalData[].class);
		List<StateHistoricalData> list = new ArrayList<StateHistoricalData>(Arrays.asList(data));
		return list;
	}

	public static List<StateHistoricalData> toStateDataAllTimeForState(String json) {
		StateHistoricalData[] data = gson.fromJson(json, StateHistoricalData[].class);
		List<StateHistoricalData> list = new ArrayList<StateHistoricalData>(Arrays.asList(data));
		return list;
	}

	public static StateHistoricalData toStateDataForStateAndDate(String json) {
		StateHistoricalData data = gson.fromJson(json, StateHistoricalData.class);
		return data;
	}

	public static List<StateInfo> toStateInfo(String json) {
		StateInfo[] data = gson.fromJson(json, StateInfo[].class);
		List<StateInfo> list = new ArrayList<StateInfo>(Arrays.asList(data));
		return list;
	}

	public static List<CountyInfo> toCountyArray(String json) {
		CountyInfo[] data = gson.fromJson(json, CountyInfo[].class);
		List<CountyInfo> list = new ArrayList<CountyInfo>(Arrays.asList(data));
		return list;
	}

	public static List<CDCData> toCDCDataArray(String json) {
		CDCData[] data = gson.fromJson(json, CDCData[].class);
		List<CDCData> list = new ArrayList<CDCData>(Arrays.asList(data));
		return list;
	}

	public static List<TrackerInfo> toURLDataArray(String json) {
		TrackerInfo[] data = gson.fromJson(json, TrackerInfo[].class);
		List<TrackerInfo> list = new ArrayList<TrackerInfo>(Arrays.asList(data));
		return list;
	}

	public static List<ScreenshotInfo> toScreenshotInfoArray(String json) {
		ScreenshotInfo[] data = gson.fromJson(json, ScreenshotInfo[].class);
		List<ScreenshotInfo> list = new ArrayList<ScreenshotInfo>(Arrays.asList(data));
		return list;
	}

}
