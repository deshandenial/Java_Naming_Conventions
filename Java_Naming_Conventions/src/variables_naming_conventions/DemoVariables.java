package variables_naming_conventions;

public class DemoVariables 
{
	/*Variable names should be short yet meaningful.
	Should not start with underscore(‘_’) or dollar sign ‘$’ characters.
	Should be mnemonic i.e, designed to indicate to the casual observer the intent of its use.
	One-character variable names should be avoided except for temporary variables.
	Common names for temporary variables are i, j, k, m, and n for integers; c, d, and e for characters.
*/
	
	
	public static void main(String[] args) 
	{
		DemoClass obj=new DemoClass();
		System.out.println(obj.name);
		
	}
	
}

class DemoClass
{

	String name="deshan";
	int number=8;
}