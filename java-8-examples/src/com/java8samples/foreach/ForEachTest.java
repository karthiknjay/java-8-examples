package com.java8samples.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		ForEachTest test = new ForEachTest();
		test.testForEach1(friends);
	}
	
	private void testForEach1(List<String> friends) {
		System.out.println("\nJava old method iterating");
		for(int i=0; i<friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		
		System.out.println("\nJava 5 enum iteration");
		for(String name : friends) {
			System.out.println(name);
		}
		
		System.out.println("\nNew Java 8 consumer iteration");
		//friends.forEach((final String name) -> System.out.println(name));
		friends.forEach(System.out::println); // above code simplified more
	}
	
}
