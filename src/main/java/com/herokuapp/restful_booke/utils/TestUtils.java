package com.herokuapp.restful_booke.utils;

import java.util.Random;

public class TestUtils {

	public static String getRandomValue(){
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}
}
