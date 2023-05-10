package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		Set<Integer> large=new TreeSet<Integer>();
        large.add(1);
        large.add(3);
        large.add(4);
        large.add(2);
        large.add(5);
        System.out.println(large);
        Object[] array = large.toArray();
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	
	Arrays.sort(array);
		System.out.println("The Second Largest is:"+array[3]);
		
	}

	
}
