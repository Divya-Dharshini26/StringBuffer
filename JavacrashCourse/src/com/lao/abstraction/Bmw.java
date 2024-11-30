package com.lao.abstraction;

public class Bmw extends Car{
	
	@Override
	public  void engineSecret() {
		System.out.println("Engine Secret");
	}
	
	@Override
    public  void companyVault() {
		System.out.println("Company Vault");
	}

	public static void main(String[] args) {

		Car car= new Bmw();
		car.engineSecret();
		car.companyVault();
		

	}

}
