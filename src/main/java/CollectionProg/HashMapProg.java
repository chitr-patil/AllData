package CollectionProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapProg {

	public static void main(String[] args) {
 
	HashMap hm=new HashMap();
	hm.put(1, "Digvijay");
	hm.put(2, "Chitra");
	hm.put(3, "Abhidnya");
	hm.put(4, "Aai");
	hm.put(5, "Baba");          // till there all keys & values are printed.
	System.out.println(hm);
	hm.put(null, "abc");
	System.out.println(hm);
	hm.put(null, "xyz");
	System.out.println(hm);      // here only one null keys are allowed cz here result is 1st null keys are replaced by update null key.& all print in a one line from 1st.
	hm.put(6, "lmn");
	hm.put(7, "lmn");
	System.out.println(hm);       // here we learn that duplicate values are allowed but duplicate keys are not allowed in hashmap.
    System.out.println("***************************");
    hm.entrySet();
    System.out.println(hm);
    Set a = hm.entrySet();            // here we want to print all the values one by one so we call the method entrySet which is call keys with values at a time
    Iterator itr=a.iterator();        // then we store it in a one of the variable cz bcz we have to use it in Iterator. we chose Iterator here cz is a universal
/*  System.out.println("for output");  // & it contain the methods like hasNext,next etc so bcz of that .
    for(;itr.hasNext();)               // here we give the condition like if it has next value then go in that & print next value.
    {
    	System.out.println(itr.next());    // for loop contain 3 conditions but here only one are presents so we need ot write there ; at both sides of condition.
    }
    System.out.println("*********************************");  */
    System.out.println("While output");
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
	
	
}
}
