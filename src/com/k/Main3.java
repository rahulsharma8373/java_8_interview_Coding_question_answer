package com.k;
//Given the list of integers, find 
//the first element of the list using Stream functions?
import java.util.Arrays;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          myList.stream().findFirst().ifPresent(System.out::print);

	}

}
