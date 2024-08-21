package studyopedia;

public class Demo6 {
	static int add(int x,int y)
	{
		return x+y;
	}
	static int add(int x,int y,int z)
	{
		return x+y+z;
	}
	public static void main()
	{
		System.out.println(add(8,4));
		System.out.println(add(8,8,4));
		
	}

}
