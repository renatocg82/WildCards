package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ProgramCuringa {

	public static void main(String[] args) {
	
		List<?> objList = new ArrayList<Object>();
		List<Integer> intList = new ArrayList<Integer>();
		objList = intList;
		
		Object obj = 29;
		Integer y = 39;
		obj = y;
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		System.out.println("----------------");
		
		System.out.println("Ascending order: ");
		
		List<Integer> ordInts = myInts;
		Collections.sort(ordInts);
		printList(ordInts);
		
		System.out.println("---------------");
		
		List<String> myStrings = Arrays.asList("Maria" , "Renato" , "Isabel" , "Eduardo");
		printList(myStrings);
		
		System.out.println("---------------");
		
		List<String> alphaStrings = myStrings;
		
		System.out.println("Ordem alfabética: ");
		Collections.sort(alphaStrings);
		printList(alphaStrings);
		
	}
	
	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
