package CollectionProg;

import java.util.LinkedList;

public class LinkedListProg {

	public static void main(String[] args) {

		LinkedList a=new LinkedList();
		a.add("Jon");
		a.add("Sersi");
		a.add("LittleFinger");
		a.add("Tyrion");
		a.add('+');
		a.add(1000);
		a.add(null);
		System.out.println(a);
		a.add("Jon");
		a.add("Sersi");
		a.add("LittleFinger");
		a.add("Tyrion");
		a.addFirst("Sansa");
		a.addLast("Arya");
		System.out.println(a);
		a.add(1,	"Jaime");
		System.out.println(a);
		a.poll();
		System.out.println("Poll	Operation	=	"	+	a);
		a.pollFirst();
		System.out.println(a);
		a.pollLast();
		System.out.println(a);
		a.remove();
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
		a.removeFirstOccurrence("LittleFinger");
		System.out.println(a);
	}

}
