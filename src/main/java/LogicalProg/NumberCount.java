package LogicalProg;

public class NumberCount {

	public static void main(String[] args) {

		int num=12345678,count=0;
		while(num>0) // 12345678,1234567,123456,12345,1234,123,12,1,0
		{
			num=num/10;  // 12345678, 1234567,123456,12345,1234,123,12,1,0
			count++;     // 0,           1,     2      3     4   5   6 7 8
		}
		System.out.println(count);
	}

}
