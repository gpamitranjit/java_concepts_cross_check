package com.amdocs.mainApp_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.amdocs.mainApp_5.Employee;

public class MainApp_9_16 {

	public static void main(String[] args) {
/*	Stream.contact() method crates lazily concatenated stream
 * 	whose elements are all the elements of first stream followed by all the elements of second stream.
 * 	
 * The Resulting Stream will be ordered if both of the input streams are ordered!
 * The Resulting stream will be parallel of either of the stream is parallel
 * 
 * When the resulting stream is closed, the close handler will close both the invoked streams.
 * 			
*/	
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Amit", "SDFS878", 45));
		empList.add(new Employee("Ranjit", "ASJDF223423", 67));
		empList.add(new Employee("Syamala", "SDFSDF45345", 78));
		
		List<Employee> adminList = new ArrayList<>();
		adminList.add(new Employee("Admin1", "SDFSDFS34534", 56));
		adminList.add(new Employee("Admin2", "SDFS3453", 90));
		adminList.add(new Employee("Admin3", "SDFSDF3434", 78));
		
		
		Stream.concat(empList.stream(), adminList.stream()).forEach(System.out::println);		
	}

}
