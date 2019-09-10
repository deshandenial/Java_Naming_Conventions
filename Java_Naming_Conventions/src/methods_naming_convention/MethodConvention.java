package methods_naming_convention;

public class MethodConvention 
{

	// Methods should be verbs, in mixed case with the first letter lowercase and with the first letter of each internal word capitalised.

	
	public static void main(String[] args) 
	{
		DemoTest obj = new DemoTest();
		obj.funTest();
	}
	
}

class DemoTest
{
	public void funTest()
	{
		System.out.println("hi dear!!");
	}
}
