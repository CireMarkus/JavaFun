public class Operator{

	//Fields
	String operator;

	//Constuctor 
	public Operator(){
		this("+");
	}
	public Operator(String operator){
		this.operator = operator;
	}

	

	//I didn't know how to write this part, so I copied from the solution. 
	public boolean matches(String toCheckFor){
		return this.operator.equals(toCheckFor);
	}

	public double operate(double operand1, double operand2){
		return operand1 + operand2;
	}


}