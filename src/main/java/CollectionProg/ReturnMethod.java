package CollectionProg;

public class ReturnMethod {

		public static void m1()
		{
			System.out.println("m1");
		}
		public static void m2()
		{
			System.out.println("m2");
		}
		public static int m3()
		{
			return 11;
		}
		public static String m4()
		{
			return "chitra";
		}
		public static void main(String[] args)
		{
			m1();
			m2();
			int a = m3();
			System.out.println(a);
			System.out.println(m4());
		}
	}


