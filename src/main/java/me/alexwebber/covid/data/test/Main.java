package me.alexwebber.covid.data.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import me.alexwebber.covid.data.COVIDData;
import me.alexwebber.covid.data.models.CountyInfo;
import me.alexwebber.covid.data.objects.StateListObject;

public class Main {

	public static void main(String[] args) throws IOException, CsvException {
		COVIDData covid = new COVIDData();

		URL dataStream = new URL("https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/owid-covid-data.csv");
		BufferedReader in = new BufferedReader(new InputStreamReader(dataStream.openStream()));
		CSVReader csvReader = new CSVReader(in);
		List<String[]> list = new ArrayList<>();
		list = csvReader.readAll();
		for (String[] s : list)
		{
			for (String ss : s) {
				System.out.print(ss + "\t");
			}
			System.out.print("\n");
		}
		csvReader.close();

	}

}
