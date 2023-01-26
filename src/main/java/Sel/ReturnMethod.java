package Sel;

public class ReturnMethod {
	
	public void add()
	{
		System.out.println("Add="+(10+20));
	}
	public int multiply()
	{
		return 10*20;
	}
	public String nameofEmp()
	{
		return "Harry";
	}

	public static void main(String[] args) {
      
		ReturnMethod a=new ReturnMethod();
		a.add();
		
		System.out.println("Result of multiplication = " + a.multiply());
		int result = a.multiply(); //1000
		System.out.println("Multiplication = " + result);
		
		String res = a.nameofEmp();
		System.out.println("Name of Employee = " + res);
	}

}
