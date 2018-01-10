package com.amdocs.mainApp_11;

/**
 * @author amit
 *
 */
public class MainApp_11_1 {

	public static void main(String[] args) {
	    double sum = Employee
	            .persons()
	            .stream()
	            .reduce(
	                0.0,
	                (Double partialSum, Employee p) -> {
	                  double accumulated = partialSum + p.getIncome();
	                  System.out.println(Thread.currentThread().getName()
	                      + "  - Accumulator: partialSum  = " + partialSum
	                      + ",  person = " + p + ", accumulated = " + accumulated);
	                  return accumulated;
	                },
	                (a, b) -> {
	                  double combined = a + b;
	                  System.out.println(Thread.currentThread().getName()
	                      + "  - Combiner:  a  = " + a + ", b  = " + b
	                      + ", combined  = " + combined);
	                  return combined;
	                });
	        System.out.println("--------------------------------------");
	        System.out.println(sum);

	        sum = Employee
	            .persons()
	            .parallelStream()
	            .reduce(
	                0.0,
	                (Double partialSum, Employee p) -> {
	                  double accumulated = partialSum + p.getIncome();
	                  System.out.println(Thread.currentThread().getName()
	                      + "  - Accumulator: partialSum  = " + partialSum
	                      + ",  person = " + p + ", accumulated = " + accumulated);
	                  return accumulated;
	                },
	                (a, b) -> {
	                  double combined = a + b;
	                  System.out.println(Thread.currentThread().getName()
	                      + "  - Combiner:  a  = " + a + ", b  = " + b
	                      + ", combined  = " + combined);
	                  return combined;
	                });
	        System.out.println(sum);
	}

}
