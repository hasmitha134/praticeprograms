package studyopedia;

public class Employee {
	float salary =50000;

}
class programmer extends Employee
{
	int bonus = 10000;
	public static void main()
	{
		programmer p = new programmer();
		System.out.println("programmer salary is:"+p.salary);
		System.out.println("bonus of programmer is"+p.bonus);
	}
}
