package com.amdocs.mainApp_12;

import java.util.DoubleSummaryStatistics;

/**
 * java.util package contains three classes to collect statistics:
 * 	1.	DoubleSummaryStatistics
 * 	2.	LongSummaryStatistics
 * 	3.	IntSummaryStatistics
 * 
 * We can use them to compute the summary statistics on any group of numeric data
 * 
 * The following code shows how to collect the statistics on a group of double data values.
 * 
 * @author amit
 *
 */
public class MainApp_12_36 {

	public static void main(String[] args) {
		DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
		stats.accept(100.0);
		stats.accept(300.0);
		stats.accept(230.0);
		stats.accept(532.0);
		stats.accept(422.0);
		
		long count = stats.getCount();
		double sum = stats.getSum();
		double min =  stats.getMin();
		double avg = stats.getAverage();
		double max = stats.getMax();
		System.out.printf("count=%d, sum=%.2f, average=%.2f, max=%.2f, max=%.2f\n", count, sum, min, max, avg);
		
	}

}
