public class CalculatorWithFixedOperators extends Operator{

	public static void main(String [] args){
		System.out.println("1 + 1 = " + new CalculatorWithFixedOperators(1,1,"+").operate());
		System.out.println("4 - 2 = " + new CalculatorWithFixedOperators(4,2,"-").operate());
		System.out.println("1 x 2 = " + new CalculatorWithFixedOperators(1,2,"x").operate());
		System.out.println("10 / 2 = " + new CalculatorWithFixedOperators(10,2,"/").operate());
	}

	//Fields
	double operand1;
	double operand2;
	Operator operator;

	//operations
	Division division = new Division();
	Multiplication multiplication = new Multiplication();
	Operator sum = new Operator();
	Subtraction subtraction = new Subtraction();

	//Constructor
	public CalculatorWithFixedOperators(double operand1, double operand2, String operator){
		this.operand1 = operand1;
		this.operand2 = operand2;


		if(subtraction.matches(operator)){
			this.operator = subtraction;
		}else if (multiplication.matches(operator)){
			this.operator = multiplication;
		}else if (division.matches(operator)){
			this.operator = division;
		}else
		{
			this.operator = sum;
		}
		

	}

	//Methods
	public double operate(){
		return operator.operate(operand1, operand2);
	}
}