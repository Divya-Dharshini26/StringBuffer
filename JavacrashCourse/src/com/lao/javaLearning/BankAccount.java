package com.lao.javaLearning;

public class BankAccount {
	
	Long acctNo=123567890l;
	String holderName="Divya";
	Integer acctBal=350;
	public void getBal() {
		System.out.println("Balance is"+ acctBal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account= new BankAccount();
		account.getBal();
		
				}

}
