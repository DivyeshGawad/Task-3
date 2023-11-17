package task3;

import java.util.Scanner;

public class BasicCalculator implements Calculator {

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			System.out.println("Error : Cannot Divide by zero !!");
			return Double.NaN;
		}
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BasicCalculator calculator = new BasicCalculator();
		
		System.out.println("Enter First Number : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter Second Number : ");
		double b = sc.nextDouble();
		
		System.out.println("Select Operation : ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		int choice = sc.nextInt();
		
		double result;
		
		switch (choice) {
		case 1: {
			result = calculator.add(a, b);
			System.out.println("Result : "+result);
			break;
		}
		
		case 2:{
			result =calculator.sub(a, b);
			System.out.println("Result : "+result);
			break;
		}
		
		case 3:{
			result=calculator.multiply(a, b);
			System.out.println("Result : "+result);
			break;
		}
		
		case 4:{
			result=calculator.divide(a, b);
			System.out.println("Result : "+result);
			break;
		}
		default:
			System.out.println("Invalid Input");
		}

	}

}
