package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class IntersectionSet {

	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        Set<Integer> set2=new HashSet<Integer>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.retainAll(set1);
        System.out.println("Intersecting element of two sets is"+" "+set2);
	}

}
