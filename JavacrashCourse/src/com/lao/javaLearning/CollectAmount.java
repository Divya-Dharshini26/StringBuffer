package com.lao.javaLearning;

public class CollectAmount {
	public Integer CollectedAmount=100;
	public Integer CollectAmountAndGiveItToMe() {
		System.out.println("Daddy i have collected" + CollectedAmount + "Rupees");
		return CollectedAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmount mySon=new CollectAmount();
		Integer amount =mySon.CollectAmountAndGiveItToMe();
		System.out.println("Got amount son"+ amount);

	}

}
