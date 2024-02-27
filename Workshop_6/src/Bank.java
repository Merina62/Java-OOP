//Q1
//abstract class Bank {
//     void deposit() {
//    	 System.out.println("Hello");
//     }
//}
//
//class Subclass1 extends Bank {
//    void deposit() {
//        System.out.println("This is first subclass.");
//    }
//}
//
//class Subclass2 extends Bank {
//    void deposit() {
//        System.out.println("This is second subclass.");
//    }
//}


//Q2
//abstract class Bank{
//	abstract void getBalance();
//}
//
//class BankA extends Bank{
//	void getBalance() {
//		System.out.println("$100");
//	}
//}
//
//class BankB extends Bank{
//	void getBalance() {
//		System.out.println("$150");
//	}
//}
//
//class BankC extends Bank{
//	void getBalance() {
//		System.out.println("$200");
//	}
//}





//Q3
//interface Bank {
//	void deposit();
//	void withdraw();
//}
//
//class NepalBank implements Bank{
//
//	@Override
//	public void deposit() {
//		// TODO Auto-generated method stub
//		System.out.println("Deposit section");
//	}
//
//	@Override
//	public void withdraw() {
//		// TODO Auto-generated method stub
//		System.out.println("Withdraw section");
//	}
//	
//}


//Q4
interface Bank {
	void deposit();
	void withdraw();
}

interface NepalBank extends Bank{
	void deposit1();
	void withdraw1();
}

class NB implements Bank, NepalBank{

	@Override
	public void deposit1() {
		// TODO Auto-generated method stub
		System.out.println("This is deposit 1.");
	}

	@Override
	public void withdraw1() {
		// TODO Auto-generated method stub
		System.out.println("This is withdraw 1.");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("This is deposit.");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("This is withdraw.");
	}
	
}
















