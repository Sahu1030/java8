package com.sarat.java8;

import java.util.Collections;
import java.util.stream.IntStream;

public class Java8InStreamPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The stream is not running parallelly.");  
		IntStream i = IntStream.rangeClosed(1, 5);  
		IntStream j = IntStream.rangeClosed(1, 4);  
		 i.boxed().sorted(Collections.reverseOrder()).forEach(System.out::println); 
		 
//		 i.forEach(ra-> j.
//			    // second loop for filtered elements
//			    forEach(city -> { 
//			        System.out.print(ra);
//			    }));
		 IntStream.rangeClosed(1, 5).forEach(
				 
	                val -> IntStream.rangeClosed(1, val).forEach(
	    	                res->System.out.print(res)
	        ));
			
		
//		 System.out.println("The stream is running parallellys.");  
//		IntStream r2 = IntStream.rangeClosed(1, 5);  
//	    IntStream r2Parallel = r2.parallel();  
//	    r2Parallel.forEach(System.out::println);  

	}

}
