package testJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Optional;

public class Pratice {

	public static void main(String[] args) {
	// 1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		System.out.println("Given a list of integers, find out all the even numbers that exist in the list using Stream functions?\r\n"
				+ "		");
		List<Integer> intList = Arrays.asList(11,23,56,7,67,23);
		intList.stream().filter(x->x%2==0).forEach(System.out::println);
		
//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		System.out.println("Given a list of integers, find out all the numbers starting with 1 using Stream functions?");
		intList.stream().map(s->s+"").filter(x->x.startsWith("1")).forEach(System.out::println);
		
//3. How to find duplicate elements in a given integers list in java using Stream functions?
		System.out.println("How to find duplicate elements in a given integers list in java using Stream functions?");
		intList.stream().filter(x->Collections.frequency(intList,x)>1).distinct().forEach(System.out::println);
//4. Given the list of integers, find the first element of the list using Stream functions?
		System.out.println(" Given the list of integers, find the first element of the list using Stream functions?");
		Integer num = intList.stream().findFirst().get();
		System.out.println("First......."+num);
//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
		System.out.println("Given a list of integers, find the total number of elements present in the list using Stream ");
		long total = intList.stream().count();
		System.out.println("Total......."+total);
	
		//Given a list of integers, find the maximum value element present in it using Stream functions?
		Integer maxN =intList.stream().max(Integer::compare).get();
		System.out.println("Maximum......."+maxN);
		//	7. Given a String, find the first non-repeated character in it using Stream functions?
		String str = "Java Developer";		
		Character c = str.chars().mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s)))
				   .collect(Collectors.groupingBy(x->x,Collectors.counting()))
				   .entrySet()
				   .stream()
				   .filter(i->i.getValue()==1L)
				   .map(j->j)
				   .findFirst()
				   .get().getKey();
		
		System.out.println(c);
		
		//8. Given a String, find the first repeated character in it using Stream functions?
		//9. Given a list of integers, sort all the values present in it using Stream functions?
			System.out.println("Given a list of integers, sort all the values present in it using Stream functions?");
			intList.stream().sorted().forEach(System.out::println);
 //Given a list of integers, sort all the values present in it in descending order using Stream functions?
			System.out.println("Given a list of integers, sort all the values present in it in descending order using Stream functions?");
			intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//	 11. Given an integer array nums, return true if any value appears at least twice in the array, 
			//and return false if every element is distinct.
		
		//	Map<Boolean , List<Integer>> mapb =intList.stream().collect(Colle
			// 12. How will you get the current date and time using Java 8 Date and Time API?
		 //13. Write a Java 8 program to concatenate two Streams?
					
	//Write a program to print the count of each character in a String
		Map<Character,Long> mapChar = str.chars().mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s)))
			   .collect(Collectors.groupingBy(x->x,Collectors.counting()));
			for(Map.Entry entry : mapChar.entrySet())
			{
				System.out.println("Character....."+entry.getKey());
				System.out.println("Count....."+entry.getValue());
			}
	//How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
	
			
			 List<String> strList = Arrays.asList("Two","Hello","Interview","Questions","Answers");
			 strList.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	
			 strList.stream().map(x->x+ "-"+x.length()).forEach(System.out::println);;
			 
			 Map<String, Integer> counts = strList.stream()
					 					.collect(Collectors.toMap(s->s, s->s.length()));
			 
			 for(Map.Entry entry : counts.entrySet())
				{
					System.out.println("Character....."+entry.getKey());
					System.out.println("Count....."+entry.getValue());
				}
	}
	
	
	
	//optional 
	
	

}
