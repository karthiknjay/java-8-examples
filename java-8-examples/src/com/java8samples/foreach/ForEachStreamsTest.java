package com.java8samples.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachStreamsTest {

	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		ForEachStreamsTest test = new ForEachStreamsTest();
		test.testForEachToUpperCase(friends);
		test.testForEachStartsWithN(friends);
	}
	
	private void testForEachToUpperCase(List<String> friends) {
		List<String> uppercaseNames = new ArrayList<String>();
		friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
		System.out.println(uppercaseNames);
	}
	
	private void testForEachStartsWithN(List<String> friends) {
		List<String> startsWithN = friends.stream()
										.filter(name -> name.startsWith("N"))
										.collect(Collectors.toList());
		System.out.println(startsWithN);
	}
}
