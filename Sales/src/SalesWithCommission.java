
public class SalesWithCommission {
	
	
	private double grossSales;

	//Constructor
	public SalesWithCommission(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public double getCommission() {
		return grossSales*0.15;
	}
}


