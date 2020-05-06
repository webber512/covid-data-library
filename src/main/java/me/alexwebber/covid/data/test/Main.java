package me.alexwebber.covid.data.test;

import java.io.IOException;

import me.alexwebber.covid.data.COVIDData;
import me.alexwebber.covid.data.models.BasicData;

public class Main {

	public static void main(String[] args) throws IOException {
		COVIDData covid = new COVIDData();
		BasicData[] bd = covid.basicDataRequest.getCurrentDataBasic();
		System.out.println(bd[0].getPositive());
	}

}
