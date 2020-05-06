package me.alexwebber.covid.data.test;

import java.io.IOException;

import me.alexwebber.covid.data.COVIDData;
import me.alexwebber.covid.data.models.StateData;

public class Main {

	public static void main(String[] args) throws IOException {
		COVIDData covid = new COVIDData();
		StateData[] sd = covid.state.getDataAsOfToday();
		for (StateData s : sd) {
			System.out.println(s.getState() + "     " + s.getPositive());
		}

		StateData sdks = covid.state.getDataForStateAsOfToday("KS");
		System.out.println(sdks.getTotalTestResults());
	}

}
