public class Subtraction extends Operator{

	public Subtraction(){
		super("-");
	}

	//overloading the operate method to perform subtraction.
	@Override
	public double operate(double operand1, double operand2){
		return operand1 - operand2;
	}



}