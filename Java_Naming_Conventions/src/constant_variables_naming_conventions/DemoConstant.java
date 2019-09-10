package constant_variables_naming_conventions;

public class DemoConstant
{

	/*Should be all uppercase with words separated by underscores (“_”).
	There are various constants used in predefined classes like Float, Long, String etc.*/
	
	public static void main(String[] args) {
		DemoClass obj=new DemoClass();
		System.out.println("print first name and last name concatenate:"+obj.FIRST_NAME+ " "+obj.LAST_NAME);
	}
}


class DemoClass
{
	static String FIRST_NAME="deshan";
	static String LAST_NAME="denial";
}