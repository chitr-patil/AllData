package LogicalProg;

public class SortThreeNum {

	public static void main(String[]args)
	{
		int a=40,b=21,c=33;
	    System.out.println(a+" "+b+" "+c);
	    int temp;
	    if(a>b) 
	       {
	    	temp=a;
	    	a=b;
	    	b=temp;
	       }
	    System.out.println(a+" "+b+" "+c);
	    if(b>c)
	    {
	    	temp=b;
	    	b=c;
	    	c=temp;
	    }
	    System.out.println(a+" "+b+" "+c);
		
	}

}
