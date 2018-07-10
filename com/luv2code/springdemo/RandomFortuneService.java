package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = new String[] {"Not your day!", "Good day!", "Fine day..."};

		int i = new Random().nextInt(fortunes.length);

		return fortunes[i];
	}
}
