package LogicalProg;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=371,rem,sum=0,num1;
		num1=num;
		System.out.println("Original No= "+num);
		while(num>0)
		{
		 rem=num%10;
		 sum=sum+rem*rem*rem;
		 num=num/10;
		}
		if(num1==sum)
			System.out.println(num1+" is Armstrong Number");
		else
		System.out.println("No Armstrong Number");
	}

}
