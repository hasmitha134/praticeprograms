package strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder();

		System.out.println(s.capacity());
		s.append("hello");
		System.out.println(s.capacity());
		
		s.append("java is my favourate language");
		System.out.println(s.capacity());
		

	}

}
