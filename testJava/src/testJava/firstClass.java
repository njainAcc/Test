package testJava;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class firstClass {

	public static void main(String args[])
	{
		
		//Reverse String
		String s = "Java Developer";
		String a = Arrays.stream(s.split(" "))
				         .map(x-> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
		System.out.println(a);
		
		String a1 = Arrays.stream(s.split("\\r"))
				          .map(x-> new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
		System.out.println(a1);
				

		String a2 = Arrays.stream(s.split("\\n"))
				          .map(x-> new StringBuffer(x).reverse()).collect(Collectors.joining(""));
		System.out.println(a2);
				
		
		String reverseStr = Stream.of(s)
				.map(string -> new StringBuilder(string).reverse())
				.collect(Collectors.joining());
		System.out.println("reverseStr........."+ reverseStr);
		
		// Random Number genration using Java8
		Random random = new Random();
		random.ints(2).forEach(System.out::println);
				
	}
}
