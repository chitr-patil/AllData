package StarPatternProg;

public class Prog7 {

	public static void main(String[] args) {

		// *****
		//  ***
		//   *
		
		int star=5,space=0;
		for(int row=1;row<=3;row++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;
		}
	}

}
