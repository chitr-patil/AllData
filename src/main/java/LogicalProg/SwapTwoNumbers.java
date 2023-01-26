package LogicalProg;

public class SwapTwoNumbers {

	public static void main(String[]args)
	{
		int a=11,b=22;
		System.out.println("Original A="+a+", Original B="+b);
		int temp=a;
		System.out.println(temp);
		a=b;
		System.out.println(b);
		b=temp;
		System.out.println(b);
		System.out.println("After swapping A="+a+", B="+b);
	}

}
