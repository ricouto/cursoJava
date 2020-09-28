package entities;

public class Account {

	protected int number;
	private String name;
	private double value;
	private double TAX_WITHDRAW = 5.00;
		
	public Account() {
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		depositMoney(initialDeposit);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return value;
	}
	
	public void depositMoney(double value) {
		this.value += value;
	}
	
	public void withdrawMoney(double value) {
		this.value -= (value + TAX_WITHDRAW);
	}	
	
	public String toString() {
		
		return "Account " 
			+ String.format("%04d", number)
			+ " , Holder: "
			+ name
			+ " , Balance: $ "
			+ String.format("%.2f", value);
	}
}
