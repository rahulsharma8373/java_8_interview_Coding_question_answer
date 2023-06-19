package com.k;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, find
//out all the even numbers exist in the list using Stream functions?

public class Main {

	public static void main(String[] args) {

List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
list.stream() .filter(n -> n%2 == 0)
.forEach(System.out::println);
	}

}
