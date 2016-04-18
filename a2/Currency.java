package main.java.a2;

public abstract class Currency {

	private double factor;
	private String currencyCode;
	
	public Currency(double factor, String currencyCode){
		this.factor = factor;
		this.currencyCode = currencyCode;
	}
	
	public double convertToEuro(double amount)
	{
		return Math.round(Math.pow(10.0, 2) * (amount / factor)) / Math.pow(10.0, 2);
		
	}
	
	public double convertFromEuro(double euroAmount)
	{
		return Math.round(Math.pow(10.0, 2) * (euroAmount * factor)) / Math.pow(10.0, 2);
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public double getFactor()
	{
		return factor;
	}
	
	
}
