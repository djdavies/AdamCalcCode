import java.util.HashMap;

public class Calculator {
	
	HashMap<String, Calculate> operationsMap = new HashMap<String, Calculate>();
	
	public Calculator(){
		this.operationsMap = new HashMap<String, Calculate>();
		this.operationsMap.put(Addition.AdditionSign, new Addition());
		this.operationsMap.put(Subtraction.SubtractionSign, new Subtraction());
		this.operationsMap.put(Multiplication.MultiplicationSign, new Multiplication());
		this.operationsMap.put(Division.DivisionSign, new Division());
		this.operationsMap.put(Modulas.ModulasSign, new Modulas());
	}
	
	public double calculate(double firstNumber, double secondNumber, String operation){
		
		Calculate calculate = operationsMap.get(operation);
		return calculate.calculate(firstNumber, secondNumber);
	}
}
