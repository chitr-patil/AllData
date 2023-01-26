package CollectionProg;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorProg {

	public static void main(String[] args) {
        // normal vector
		Vector v1=new Vector();
		for(int i=1;i<20;i++)
			v1.add(i);
		System.out.println(v1);
System.out.println("-----------------------------");
/*		// use get method to upper forloop
		for(int j=2;j<10;j++)
			System.out.println(v1.get(j));  ...   here in get j is a index , in for loop j=2
		System.out.println("------------------------------");
		// for each loop
		for(Object value:v1)             // use object cz collection are hetrogenious
			System.out.println(value);     */
/*		// Cursor-Enumeration
		int i=0;                            // here i is imp
		System.out.println("Enumeration Cursor Output");
		Enumeration e=v1.elements();
		while(e.hasMoreElements())                  // while loop use here cz it hasnt require condition step.
		{
			System.out.println(e.nextElement());
			i++;
			if(i==10)
				break;
		}      */
/*		// Cursor-Iterator
		System.out.println("Iterator Cursor Output");
		Iterator i=v1.iterator();
		while(i.hasNext())
		{
			int value=(Integer) i.next();   // here shows error cz collection are hetrogenius so it doesnt take only int value so i have to cast that.
			if(value%3==0)                   // remainder 0 asel tr add otherwise remove.
				System.out.println(value);
			else
				i.remove();
		}      */	
		
		// Cursor-ListIterator
		
		System.out.println("ListIterator Cursor Output");
		ListIterator l=v1.listIterator();
		int i=1;
		while(l.hasNext())
		{
			System.out.print(l.next()+" ");
			i++;
			if(i==10)
				break;
		}
		
	}

}
