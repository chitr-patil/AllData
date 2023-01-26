package LogicalProg;

public class LargestOfThreeNum {

	public static void main(String[]args)
	{
		int a=20,b=30,c=40;
		if(a>b && b>c)
		System.out.println("Largest Number of three is="+a);
		if(b>a && b>c)
			System.out.println("Largest Number of three is ="+b);
		else
		System.out.println("Largest Number of three is ="+c);
	}

}
