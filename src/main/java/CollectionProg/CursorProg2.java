package CollectionProg;

import java.util.Vector;

public class CursorProg2 {

	public static void main(String[] args) {

		Vector v1=new Vector();
		for(int i=1;i<=20;i++)
		v1.add(i);
		System.out.println(v1);			System.out.println("********************************");
			for(int j=1;j<=10;j++)
				v1.get(j);
			System.out.println(v1);
			for(Object value:v1)
		    System.out.println(value);
	}

}
