package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;


public class FilteringExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Niket", "Parag", "Prabal");
		obj.stream().filter((i->i.length()>5)).forEach((i)-> System.out.print(i+" "));

		obj.stream().limit(1).forEach((i)->System.out.println(i+" "));
		obj.stream().skip(1).forEach((i)->System.out.println(i+" "));
	}

}