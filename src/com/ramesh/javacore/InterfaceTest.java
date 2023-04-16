package com.ramesh.javacore;


abstract interface BankAtm {  //this interface by default having abstract. and we cant create object for this interface.

	String bankName = "AXIX BANK"; //inside the interface variables having default public, static, final
	void pinChange();//inside the interface methods having default public and abstract ....these all are providing offline services
	void miniStmt();//inside the interface methods having default public abstract....these all are providing offline services
	double cashwithDraw();// ....these all are providing offline services
	double cashDeposit();//  ....these all are providing offline services
	public abstract void setPin();//when ever we are having atleast one abstract method inside the class then we need to declare that class as a abstract.
	public static void accCreation()   // this is interface static method.. can we override this method into the child class, no its not possible. bec of this interface static methods are not available into the child classes implementation classes. and also we cant override this method.
	{                                   // how can we access this method only one way is there that is only through interface name.
		System.out.println("Account created");
	}
	public static void bankBal()  //this is interface default method.. and also this is available to the child class and implementations class, we can oerride this default method.but we need to remove this default and add public in the child class then we can override.
	{
		System.out.println("25000");
	}
	
	public static void dohardwork()
	{
		System.out.println("SUBJECT = JOB");
	}
	
	public static void result()
	{
		System.out.println("SUBJECT FIRST JOB NEXT");
	}
	
}
abstract class BankAtmImpl implements BankAtm{ //when ever a class implementing the implements we need to provide all implementations for the all methods.

	@Override
	public void pinChange() {
		System.out.println("pc");
		
	}

	@Override
	public void miniStmt() {
		System.out.println("MS");
		
	}
    
	@Override
	public double cashwithDraw() {
		System.out.println("CWD");
		return 45677990;
	}

	@Override
	public double cashDeposit() {
		System.out.println("CD");
		return 8903880;
	}

	public void loans() {
		System.out.println("LOANS");
		
	}
	
	public void bankBal()  //this is interface default method.. and also this is available to the child class and implementations class, we can oerride this default method.but we need to remove this default and add public then we can override.
	{
		System.out.println("95525000");
	}
	
}
class BankAtmImplOne extends BankAtmImpl{
	@Override
	public void setPin() {
		System.out.println("SETPIN");
	}
	public void carLoan() {
		System.out.println("CAR LOAN");
	}
	
}
public class InterfaceTest {
public static void main(String[] args) {
	
	//BankAtm atm = new BankAtm();
	// BankAtmImpl impl = new BankAtmImpl();
	BankAtmImplOne atm = new BankAtmImplOne();
	atm.bankBal();  
	//BankAtm bankatm = new BankAtmImplOne();
	//bankatm.carLoan();
	/*bankatm.cashDeposit();
	bankatm.cashwithDraw();
	//bankatm.loans();
	bankatm.miniStmt();
	bankatm.pinChange();
	bankatm.setPin();
	String bankNameResp = bankatm.bankName;
	System.out.println("Bank name is:" +bankNameResp);
	String bankNameResp1 = BankAtm.bankName;
	System.out.println("Bank name is:" +bankNameResp1);
   */
	BankAtm.accCreation();
}
}
