package pratice_12;

public class Account {
	String accounNo;
	String name;
	int balance;
	
	public Account(String name) {
		this(name, 0);
	}
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int amount) throws MalformedData {
		if (amount < 0) 
			throw new MalformedData("0 이상의 값을 입력하세요.");
		else
			balance += amount;
		
	}
	
	public int withdraw(int amount) throws MalformedData, BalanceOutOfBoundsException {
		if (amount < 0)
			throw new MalformedData("0 이상의 값을 입력하세요.");
		else if(balance < amount)
			throw new BalanceOutOfBoundsException("잔액을 초과하였습니다.");
		else
			balance -= amount;
		
		return amount;
	}
	
	public void check() {
		System.out.println("잔액: " + balance);
	}
	
}
