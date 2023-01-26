package LogicalProg;

public class PrimeNumber {

	public static void main(String[] args) {

		// 1,3,5,7,11,13,17,19...
		
		int num=23,count=0;
		if(num>0)
		{
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
		}
		if(count==1)
			System.out.println("non prime");
		else
			System.out.println("prime");
	}

}
