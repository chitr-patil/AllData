package StarPatternProg;

public class Prog5 {

	public static void main(String[] args) {

		//   *
		//  ***
		// *****
       // *******
      // *********

		int star=1,space=4;
		for(int row=1;row<=5;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star = star + 2;
		}
	}
}
