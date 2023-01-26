package StarPatternProg;

public class BlockProg {

	public static void main(String[] args) {

		BlockProg b=new BlockProg();
	}
				
	static
	{
		System.out.println("This is static block");
	}

	{
		System.out.println("This is instant block");
	}
	BlockProg()
	{
		System.out.println("This is constructor");
	}
}
