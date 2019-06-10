package com.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_1 {

	public static void main(String[] args) {
		
		 String[] array = {"five","four","one","seven","zero"}; 
		 for (String string : array) {
			System.out.println(string);
		} 
		  for (String string : array) {
			 if(!string.equals("one")) { 
				 System.out.println(string);
			 }
		}  
		  Stream<String> s =	  Arrays.stream(array);  
		  System.out.println("________");
		  s.forEach(s1->System.out.println(s1)); 
		     
		  
		  Stream<Integer> b =	   Stream.of(1,2,3,2); 
		  b.forEachOrdered(c->System.out.println(c)); 
		  
		  
		   System.out.println("creating a list  ");
		   
		   List<Double> d = new ArrayList<>(); 
		   d.add(10.00); 
		   d.add(21.00);
		   d.add(14.00);
		   d.add(13.00);
		   d.add(8.00); 
		   d.stream().forEach(d1->System.out.println(d1));  
		   System.out.println("..............................");
		   d.parallelStream().forEach(d1->m1(d1)); 
		    System.out.println("22222222"); 
	 long	    countofselements =   d.stream().distinct().count();  
	 System.out.println("333333");
	 System.out.println(countofselements);  
	 
	  List<String > ab = new ArrayList<>(); 
	  ab.add("nithish");
	  
	    
	System.out.println( ab.stream().anyMatch(s2->s2.contains("reddy")));
		   
		   
		 

	}

	private static void m1(Double d1) {
		
		System.out.println(d1);
	}

}
