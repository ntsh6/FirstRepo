package com.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client_4 { 
	public static void main(String[] args) {
		  String[] s = {"a","b","d","c"}; 
		  Stream<String> a =Arrays.stream(s); 
		  a.forEach(b-> System.out.println(b)); 
		  
		  
		  System.out.println("-----------");  
		  Stream<String> c =	    Stream.of("a","b","d"); 
		  c.forEach(d->System.out.println(d)); 
		    
		  
		  
		  List<String> l = Arrays.asList("nithish","kolli","reddy"); 
		  l.parallelStream().forEach(z->processing(z));
		  
		  
	}

	private static void processing(String z) {
		// TODO Auto-generated method stub
		System.out.println(z);
	}

}
