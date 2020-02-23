public class Calculator{
	//Fields
	double operand1;
	double operand2;
	String operator;

	//Constructorfff
	public Calculator(double one, double two, String operator){
		this.operand1 = one;
		this.operand2 = two;
		this.operator = operator;

	}

	//methods
	public double operate (){

		if(operator == "+"){
			return operand1 + operand2;
		} else if(operator == "-"){
			return operand1 - operand2;
		} else if(operator == "x"){
			return operand1 * operand2;
		} else if(operator == "/"){
			return  operand1 / operand2;
		}
		else 
		{
			System.out.println("Error, invalid Input");
			return 0;
		}

	}

	public static void main(String[] args){
		Calculator cal1 = new Calculator(10,2,"x");

		Calculator cal2 = new Calculator(15,3,"/");

		Calculator cal3 =  new Calculator(2,4,"+");

		System.out.println(cal1.operate());
		System.out.println(cal2.operate());
		System.out.println(cal3.operate());
	}
}