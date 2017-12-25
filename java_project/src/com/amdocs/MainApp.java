package com.amdocs;

import com.amdocs.config.MyIterable;

/**
 * @author Amit
 *
 */
public class MainApp {

	public static void main(String[] args) {
		String[] technologies = {"java", "jee", "spring", "spring boot"};
		MyIterable<String> iterableTechnologies = new MyIterable<>(technologies);
		for(String currentTechnology : iterableTechnologies) {
			System.out.println(currentTechnology);
		}
		
		while(iterableTechnologies.iterator().hasNext()) {
			iterableTechnologies.iterator().next();
			iterableTechnologies.iterator().remove();
		}
	}

}
