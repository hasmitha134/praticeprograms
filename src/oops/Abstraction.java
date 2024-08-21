package oops;
abstract class Bank
{
	abstract int getrateofintrest();
}
class BOI extends Bank
{
	int getrateofintrest()
	{
		return 7;
		
	}
	
}
class SBI extends Bank
{
	int getrateofintrest()
	{
		return 8;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		
	 
		b = new BOI();
		System.out.println("rate of intrest is:"+b.getrateofintrest()+"%");
		
		b=new SBI();  
		System.out.println("rate of intrest is:"+b.getrateofintrest()+"%");

	}

}
