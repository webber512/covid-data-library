package me.alexwebber.covid.data.test;

import java.io.IOException;

import me.alexwebber.covid.data.COVIDData;
import me.alexwebber.covid.data.models.BasicData;
import me.alexwebber.covid.data.models.BasicHistoricalData;

public class Main {

	public static void main(String[] args) throws IOException {
		COVIDData covid = new COVIDData();
		BasicData bd = covid.USDataRequest.getBasicDataAsOfToday();
		BasicHistoricalData[] bdc = covid.USDataRequest.getBasicHistoricalDataAllTime();

		System.out.println(bd.getTotal());
		for (BasicHistoricalData b : bdc) {
			System.out.println(b.getDate() + "    " + b.getTotal());
		}

		System.out.println("");
		BasicHistoricalData bdcd = covid.USDataRequest.getBasicHistoricalDataForDate("20200408");
		System.out.println(bdcd.getTotal());
	}

}
