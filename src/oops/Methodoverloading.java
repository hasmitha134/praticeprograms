package oops;
class Addition
{
	static int add (int a ,int b)
	{
		return a+b;
	}
	static int add (int a ,int b ,int c)
	{
		return a+b+c;
	}
}

public class Methodoverloading {
	public static void main()
	{
		System.out.println(Addition.add(12, 15));
		System.out.println(Addition.add(12, 15,15));
	}

}
