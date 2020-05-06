package me.alexwebber.covid.data.test;

import java.io.IOException;
import java.util.List;

import me.alexwebber.covid.data.COVIDData;
import me.alexwebber.covid.data.objects.StateListObject;

public class Main {

	public static void main(String[] args) throws IOException {
		COVIDData covid = new COVIDData();
		List<StateListObject> states = covid.state.getStates();
		for (StateListObject s : states) {
			System.out.println(s.getAbbreviation() + "     " + s.getName());
		}
	}

}
