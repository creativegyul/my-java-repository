package ex01_class;
//은행
//필드: 은행명(bankname),계좌번호(bankno),잔액(balance)
//생성자, getter, setter
public class Bank {
	//필드
	private String bankname;
	private String bankno;
	private int balance;
	//생성자: 오버로딩
	public Bank(String bankname, String bankno) {
		//super(); //부모클래스의 생성자를 실행하는 메소드
		this.bankname = bankname;
		this.bankno = bankno;
	}
	Bank (String bankname, String bankno, int balance){
		this.bankname=bankname;
		this.bankno=bankno;
		this.balance=balance;
	}
	//setter/getter
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankno() {
		return bankno;
	}
	public int getBalance() {
		return balance;
	}
	//메소드:입금
	void deposit(int a) {
		balance+=a;
	}
	//메소드:출금
	void withdraw(int a) {
		if (balance-a<0)
			System.out.println("[잔액 이상 출금 불가]");
		else balance-=a;
	}
	//어노테이션
	//오버라이딩: 부모 클래스의 메소드를 재정의
	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}

}
