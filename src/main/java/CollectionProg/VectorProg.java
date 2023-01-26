package CollectionProg;

import java.util.Collections;
import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {
 
        Vector v=new Vector();
        System.out.println(v.capacity());
        for(int	i=1;i<10;i++)
        v.add(i);
        System.out.println(v);
        System.out.println(v.capacity());
        v.add(100);
        System.out.println(v);
        //System.out.println(v.capacity());		
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.firstElement());
        for(int i=2;i<=20;i++)
        	v.add(i);
        System.out.println(v);
        for(Object value:v)
        	System.out.println(value);
	}	
	

}
