package me.alexwebber.covid.data.test;

import java.io.IOException;
import java.util.List;

import me.alexwebber.covid.data.COVIDData;
import me.alexwebber.covid.data.models.CountyInfo;
import me.alexwebber.covid.data.objects.StateListObject;

public class Main {

	public static void main(String[] args) throws IOException {
		COVIDData covid = new COVIDData();

		List<CountyInfo> countiesInKS = covid.county.getCountiesInState("WA");
		System.out.print(countiesInKS.size());
		for (CountyInfo c : countiesInKS) {
			System.out.println(c.getCountyName());
		}

	}

}
