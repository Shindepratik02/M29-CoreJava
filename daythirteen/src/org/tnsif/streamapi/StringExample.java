package org.tnsif.streamapi;

import java.util.stream.Stream;

public class StringExample {
	
	public static void main(String[] args) {
		Stream<Integer>s=Stream.of(11,30,50,26);
		s.forEach((i)-> System.out.println(i*5));
	}

}
