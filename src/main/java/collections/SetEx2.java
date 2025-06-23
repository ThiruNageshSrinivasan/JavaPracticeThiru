package collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		Set<Integer> ls =new HashSet<Integer>();
		ls.add(1);
		ls.add(1);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		boolean flag=ls.contains(4);
		boolean flag2=ls.isEmpty();
		System.out.println(flag);
		System.out.println(flag2);
		for(Integer x:ls) {
			System.out.println(x);
		}
		

	}

}
