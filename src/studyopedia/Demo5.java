package studyopedia;

public class Demo5 {
	static void person(String name,int age)
	{
	System.out.println(name+ "is"+age);	
	}
	static int add(int x,int y)
	{
		return x+y;
	}
	static int add(int x,int y,int z)
	{
		return x+y+z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person("ram",25);
		person("sita",23);
		System.out.println(add(8,4));
		System.out.println(add(8,8,4));

	}

}
