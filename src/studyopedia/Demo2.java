package studyopedia;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		double num1,num2,result;
		  Scanner input = new Scanner(System.in);
		System.out.println("choose the operator:+,-,*,or /");
		operator = input.next().charAt(0);
		System.out.println("enter first number");
		num1 = input.nextDouble();
		System.out.println("enter second number");
		num2 = input.nextDouble();
		switch(operator)
		{
		case '+':
		result=num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		break;
		case '-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+"="+result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(num1+"*"+num2+"="+result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
			break;
			default:
				System.out.println("invalid operator");
				break;
		
		}
		
		
		

	}

}
