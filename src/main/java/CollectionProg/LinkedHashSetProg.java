package CollectionProg;

import java.util.LinkedHashSet;

public class LinkedHashSetProg {

	public static void main(String[] args) {

		LinkedHashSet a=new LinkedHashSet();
		LinkedHashSet b=new LinkedHashSet(1000);
		LinkedHashSet c=new LinkedHashSet(900,99);
		LinkedHashSet d=new LinkedHashSet(a);
		
		a.add(50);
		a.add(48);
		a.add(33);
		a.add(15);
		System.out.println(a);
		a.add("ZZZZZ");
		a.add("AAAAAA");
		a.add("BBBB");
		a.add("A");
		System.out.println(a);
		a.add(10);
		a.add(null);
		System.out.println(a);
		a.add(null);
		System.out.println(a);
	}

}
