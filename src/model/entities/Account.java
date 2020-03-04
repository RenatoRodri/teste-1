package model.entities;


public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double widhdramLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double widhdramLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.widhdramLimit = widhdramLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public Double getWidhdramLimit() {
		return widhdramLimit;
	}

	public void deposit(double amount) {
		 balance += amount;
	}
	
	public void whitdraw(double amount) throws Exception  {
		if(amount > widhdramLimit ) {
			throw new Exception("The amount exceeds withdraw limit");
		}
		
		if(amount > balance) {
			throw new Exception("Not enough balance");
		}
		
		balance -= amount;
	}
	
	
	
	
}
