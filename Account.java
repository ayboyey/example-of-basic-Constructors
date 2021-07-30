package oop;

public class Account {

	private String accountno ;
	private double balance ; 
	private String name ; 
	private String email ; 
	private String phonenumber;
	
	
	
	public Account(String accountno,double balance,String name,String email,String phonenumber) {
		
		this.accountno = accountno;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		
	}
	
		
	
	
	public void deposit(double amount ) {
		
		balance += amount  ; 
		System.out.println("new balance : "  +  balance);
			}

	public  void withdrawmoneymoney(double amount ) {
		
		if (amount > 1500) {
			
			System.out.println("you can get money max 1500");
			
			
			
		}
		
		
		if(balance-amount < 0) {
			
			System.out.println("insufficient balance");
			
			
			
		}
		else {
			
			balance -= amount ; 
			System.out.println("new balance : "   + balance  );
			
		}
		
	}












	public String getAccountno() {
		return accountno;
	}












	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}












	public double getBalance() {
		return balance;
	}












	public void setBalance(double balance) {
		this.balance = balance;
	}












	public String getName() {
		return name;
	}












	public void setName(String name) {
		this.name = name;
	}












	public String getEmail() {
		return email;
	}












	public void setEmail(String email) {
		this.email = email;
	}












	public String getPhonenumber() {
		return phonenumber;
	}












	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	