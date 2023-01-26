package CollectionProg;

import java.util.Vector;

public class VectorProg2 {

	public static void main(String[] args) {
 
		Vector v1=new Vector();
		Vector v2=new Vector(100);
		Vector v3=new Vector(11,30);
		Vector v4=new Vector(v1);
		
		System.out.println(v3);
		System.out.println(v1.capacity());
		System.out.println(v2.capacity());
		System.out.println(v3.capacity());
		System.out.println(v4.capacity());
		
		for(int i=0;i<20;i++)
			v3.add(i);
		System.out.println(v3);
		System.out.println(v3.capacity());
		v3.add("ABC");
		System.out.println(v3.capacity());
		v1.add("chitra");
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.capacity());
		v1.addElement(1000);
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.remove(0));
		System.out.println(v1.removeElement(1));
		
		
	}

}
