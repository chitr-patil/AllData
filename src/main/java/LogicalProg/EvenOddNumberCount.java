package LogicalProg;

public class EvenOddNumberCount {

	public static void main(String[] args) {

		int num=12345678,countEven=0,countOdd=0,rem;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
				countEven++;
			if(rem%2==1)
				countOdd++;
			num=num/10;
		}
		System.out.println(countEven);
		System.out.println(countOdd);
	}

}
