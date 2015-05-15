import java.util.Scanner;


public class CalculatorApplication {
	
	public static String firstNumber;
	public static String secondNumber;
	public static String operation;
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Whats is your first number");
		firstNumber = scanner.next(); 
		
		System.out.println("Whats is your second number");
		secondNumber = scanner.next(); 
		
		System.out.println("Whats is your operation");
		operation = scanner.next();
		
		double value = Double.parseDouble(firstNumber);
		
		Calculator calculator = new Calculator();
		double result = (calculator.calculate(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber), operation));
		System.out.println("Result: " + result +"");
	}
}
