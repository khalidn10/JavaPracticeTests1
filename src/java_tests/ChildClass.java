package java_tests;

public class ChildClass extends ParentClass {

	public int i = 20;
	//public int j = 30;
	
	public void printMethod()
	{
		System.out.println("child printMethod");
		super.printMethod();
	}
	
	public static void printStaticMethod()
	{
		System.out.println("child printStaticMethod");
	}

	public static void main(String[] args)
	{
		ParentClass a = new ChildClass();
		
		System.out.println(a.i);
		a.printMethod();
		ParentClass.printStaticMethod();
		a.printExtraMethod();
		//System.out.println(a.j);
		
		ChildClass b = new ChildClass();
		
		System.out.println(b.i);
		b.printMethod();
		ChildClass.printStaticMethod();
		b.printExtraMethod();
	}
}
