package LogicalProg;

public class Factorial {

	public static void main(String[] args) {

		// 4!=4*3*2*1
		
		int num=15,fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" = "+fact);
	}

}
