package com.amdocs.mainApp_12;

import java.util.function.BiConsumer;

public class Averager implements BiConsumer<Averager,Double> {

	private int total = 0;
	private int count = 0;
	
	public void combine(Averager avg1, Averager avg2) {
		
	}

	@Override
	public void accept(Averager arg0, Double arg1) {
		// TODO Auto-generated method stub
		
	}
}
