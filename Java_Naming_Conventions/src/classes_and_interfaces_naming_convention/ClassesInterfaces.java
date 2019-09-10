package classes_and_interfaces_naming_convention;

public class ClassesInterfaces implements Test1
{

//	Classes and Interfaces :
//		Class names should be nouns, in mixed case with the first letter of each internal word capitalised. Interfaces name should also be capitalised just like class names.
//		Use whole words and must avoid acronyms and abbreviations.
	
	int a=5;
	int b=5;
	int c;
	@Override
	public void demoMethod1()
	{
		
		int c=a+b;
		System.out.println("print c value:"+c);
				
	}
	
	public static void main(String[] args)
	{
		Test1 obj=new ClassesInterfaces();
		obj.demoMethod1();
		
	}


}