package com.java8samples.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StreamsTest {

	public static void main(String[] args) {
		StreamsTest test = new StreamsTest();
		test.runTest();
	}
	
	private void runTest() {
		List<BigDecimal> prices = new ArrayList<BigDecimal>();
		prices.add(new BigDecimal(10));
		prices.add(new BigDecimal(15));
		prices.add(new BigDecimal(50));
		
		BigDecimal discounted = 
				prices.stream()
					.filter(price -> price.compareTo(BigDecimal.valueOf(0)) > 0)
					.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
					.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println("Discounted value : " + discounted);
	}

}
