package testJava;

import java.util.Arrays;

import java.util.Map;
import java.util.Optional;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestProg {

	public static void main(String args[])
	{
		
		//Java 8 Program to add prefixe and suffix to the String?
		StringJoiner strJoiner = new StringJoiner(" ","[","]");
		
		strJoiner.add("Java");
		strJoiner.add("Developer");
		strJoiner.add("Test");
		
		System.out.println("Java 8 Program to add prefixe and suffix to the String?-------"+strJoiner);
		
		//Java 8 Program to Print ten random numbers using forEach?
		
		System.out.println("Java 8 Program to Print ten random numbers using forEach?");
		Random random = new Random();
		random.ints(5).forEach(System.out::println);
		
		//Java 8 program to iterate a Stream using the forEach method?
		System.out.println("Java 8 program to iterate a Stream using the forEach method?");
		List<String> str = Arrays.asList("Hello","Interview","Questions","Answers");
	    str.stream().forEach(System.out::println);   
		
		//	Q4). Java 8 program to find the Minimum number of a Stream?
		List<Integer> intList = Arrays.asList(11,23,56,7,67);
		Integer maxNum = intList.stream().max(Integer::compare).get();
		System.out.println("Java 8 program to find the Maximum number of a Stream?............."+maxNum);
		 Integer min = //Stream.of(1, 2, 3, 4, 5, 6,7)
				 intList.stream()
                 .min(Comparator.comparing(Integer::valueOf))
                 .get();
		 System.out.println("Java 8 program to find the Minimum number of a Stream?............."+min);
		 Integer minNum = Stream.of(1, 2, 3, 4, 5, 6,7).collect(Collectors.minBy(Integer::compare)).get();
		 System.out.println("Java 8 program to find the Minimum number of a Stream?............."+minNum);
								
		 
		 //Java 8 program to Count Strings whose length is greater than 3 in List?
		 
		 List<String> strList = Arrays.asList("Two","Hello","Interview","Questions","Answers");
		long countStr = strList.stream().filter(x->x.length()>3).count();
		 System.out.println("Java 8 program to Count Strings whose length is greater than 3 in List?\r\n"
		 		+ "		 ...."+countStr);
		 // Java 8 program to Print Strings whose length is greater than 3 in List.
		 
		 
		 System.out.println(" Java 8 program to Print Strings whose length is greater than 3 in List.");
		 strList.stream().filter(x->x.length()>3).forEach(System.out::println);
		 
		// Java 8 program to multiply 3 to all elements in the list and print the list?
		 System.out.println("Java 8 program to multiply 3 to all elements in the list and print the list?");
		 List<Integer> intList1 = Arrays.asList(11,23,56,7,67,24,36);
		 intList1.stream().map(x->x*3).forEach(System.out::println);
		 
		 
		 // Lost of Even or Odd number
		Map<Boolean,List<Integer>> ab= intList1.stream().collect(Collectors.partitioningBy(i->1%2==0));
		 
		
		for(Map.Entry entry : ab.entrySet())
		{
			System.out.println("Boolean Key........."+ entry.getKey());
			System.out.println("List Value........."+ entry.getValue());
		}
			//	 Q9) Java 8 program to perform concatenation on two Streams?
		 System.out.println("Java 8 program to perform concatenation on two Streams?");
		 List<Integer> integerList1 = Arrays.asList(1,34,67,34);
		 List<Integer> integerList2 = Arrays.asList(346,89,45);
		 Stream.concat(integerList1.stream(), integerList2.stream()).forEach(System.out::println);
				// Q10). Java 8 program to remove the duplicate elements from the list?
		 System.out.println("Java 8 program to remove the duplicate elements from the list?");
		 List<Integer> intDList = Arrays.asList(11,23,56,7,67,11,67);
		 intDList.stream().distinct().forEach(System.out::println);
		 
		 //Q11). Print current date and time in Java 8 Date and Time API?
		 System.out.println("Print current date and time in Java 8 Date and Time API?");
		 System.out.println(java.time.LocalDateTime.now());
		 
				 //Q12). Java 8 program to Sort the given list?
		 System.out.println("Java 8 program to Sort the given list?");
		 List<String> strList1 = Arrays.asList("Two","Hello","Interview","Questions","Answers");
		 strList1.stream().sorted().forEach(System.out::println);
		 System.out.println("------------------------Reverse-----------");
		 strList1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		 System.out.println("----------------------Natural-------------");
		 strList1.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		 System.out.println("---------------Reverse--------------------");
		 strList1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 
		 //Write a Java 8 program to get the sum of all numbers present in a list.
		 List<Integer> intDList1 = Arrays.asList(1,2,5,7,3,9,12);
		Integer sumInt= intDList1.stream().reduce((a,b)-> a+b).get();
		System.out.println("Write a Java 8 program to get the sum of all numbers present in a list.............."+sumInt);
		 //Q14) Java 8 program to perform cube on list elements and filter numbers greater than 50.
		System.out.println("Java 8 program to perform cube on list elements and filter numbers greater than 50.");
		intDList1.stream().map(x->x*x*x).filter(i->i>50).forEach(System.out::println);
		
		
		Map<Boolean,List<Integer>> mapI =intDList1.stream().collect(Collectors.partitioningBy(i->i%2==0));
		 for(Map.Entry entry : mapI.entrySet())
	     {
	     	System.out.println("Boolean......."+entry.getKey());
	     	System.out.println("List......."+entry.getValue());
	     }
		 /*
		 
		 Optional.ofNullable(listNum)
		         .orElseGet(Collections::emptyList)
		         .stream()
		         .filter(Object::notNull)
		         */
		
		 System.out.println("Neelam"+15*30);
		 System.out.println(15*30+"Neelam");
	}
}
