package com.amdocs.mainApp_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MainApp_9_14 {

	public static void main(String[] args) {
//		Making use of our own consumer so as to make the processing faster!
		System.out.println("=============================================================");
		List<Person> roster = new ArrayList<>();
		
		roster.add(new Person("Amit", 26, Gender.MALE.toString()));
		roster.add(new Person("Ranjit", 29, Gender.MALE.toString()));
		roster.add(new Person("Smita", 27, Gender.FEMALE.toString()));
		
		
		Averager averageCollect = roster.stream()
				.filter(p -> p.getGender() == Gender.MALE.toString())
				.map(Person::getAge)
				.collect(Averager::new, Averager::accept, Averager::combine);
		
		System.out.println("Average age of male members: " + averageCollect.average());
		
		
		
		System.out.println("=============================================================");
		System.out.println("grouping the person's based on Gender!");
		Map<String, List<Person>> byGender = roster.stream().collect(Collectors.groupingBy(Person::getGender));
		
		for(Entry<String, List<Person>> entry : byGender.entrySet()) {
			System.out.println("Gender: " + entry.getKey() + ", count: " + entry.getValue().size());
		}
	}

}
