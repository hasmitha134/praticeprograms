package oops;
class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
public class Testinheritane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		d.eat();
		d.bark();

	}

}
