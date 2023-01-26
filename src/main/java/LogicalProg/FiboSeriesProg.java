package LogicalProg;

public class FiboSeriesProg {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13
		 int num1=1,num2=2,sum=0;
		 System.out.println(num1+" "+num2);
		 for(int i=0;i<10;i++)
		 {
			sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
		 }
	}

}
