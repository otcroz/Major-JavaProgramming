public class Account {
	String accountNo;
	String name;
	int balance;
	
	public Account() {};
	public Account(String name) {
		this("이름없음", name,0);
	}
	public Account(String accountNo, String name) {
		this(accountNo, name,0);
	}
	public Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	

	public void deposit(int amount) throws MalformedData {
		if(amount < 0) 
			throw new MalformedData("잘못된 금액입니다.");
		else
			balance += amount;
	}

	public int withdraw(int amount) throws MalformedData, BalanceOutBoundsException  {
		if(amount <0)
			throw new MalformedData("잘못된 금액입니다.");
		else if (balance < amount) {
			throw new BalanceOutBoundsException("잔액을 초과하였습니다.");
		}
		else {
			balance -= amount;
		}
		return amount;
	}

	public void check() {
		System.out.println("잔액: " + balance);
	}
}


