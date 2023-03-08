package com.sarat.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Java8MapFIlterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
		list.add(1);list.add(5);		list.add(2);		list.add(3);		list.add(4);
		System.out.println(list);
		//For filter according to filter condition from list
		List l1=(List) list.stream().filter(S->S % 2 ==0).collect(Collectors.toList());
		System.out.println("Filter all the elsment: "+l1);
		//For Map to  all Elements
//		l1.forEach(System.out::print);
		List l2=(List<?>) list.stream().map(S->S*2).collect(Collectors.toList());
		System.out.println("Mapping to all element : "+l2);
		//For Sorting
		List sort=list.stream().sorted().collect(Collectors.toList());
		List sort1=list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("Sorted Array: "+sort1);
		int max=list.stream().max((o1, o2) -> o1.compareTo(o2)).get();
		//list.stream().reduce(max, Integer::min);
		System.out.println("Max element from list : "+max);
		//For Count
		long count=list.stream().filter(S->S>=3).count();
		System.out.println("Count in List : "+count);
		//ForEach Condition in Java8
		System.out.println("ForEach works in java 8 ");
		 list.stream().forEach(S->System.out.print(S)) ;
		 //Sum of all even numbers
		 int sum1 = list.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
		 System.out.println("Sum of even numbers "+sum1);
		 OptionalDouble average = list.stream().mapToInt(a->a).average();
		 System.out.println("Average of list "+average);
		 list.stream().map(S->S*2).collect(Collectors.toList()).forEach(System.out::print);
			
		}
	}
