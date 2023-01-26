package LogicalProg;

import java.util.Scanner;

public class EvenOddProg {

	public static void main(String[] args) {

	int num;
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	System.out.println("Number="+num);
	if(num%2==0)
		System.out.println("Even no");
	else
		System.out.println("Odd no");
	}

}
