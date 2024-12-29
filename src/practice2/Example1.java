package practice2;

public class Example1 {
int balance=1100;
	
	void creditAmt(){
		balance=balance + 300;
	}
	
	void debitAmt(){
		balance=balance - 500;
		}
		
	void display(){
		System.out.println("Current balance is " + balance);
		System.out.println("Commit 2");
	}

	public static void main (String[] args){
		Example1 b=new Example1();
		b.creditAmt();
		b.debitAmt();
		b.creditAmt();
		b.display();
	}
}
