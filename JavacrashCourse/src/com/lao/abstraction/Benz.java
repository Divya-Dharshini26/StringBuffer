package com.lao.abstraction;

public class Benz extends Car implements UpcomingProjects {
	
	@Override
	public void engineSecret() {
		System.out.println("Benz Engine Secret");
	}
	public void companyVault() {
		System.out.println("Benz Company Vault");
	}
	
	@Override
	   public void method1() {
		   System.out.println("hlooo");
	   }
		@Override
		public void method2() {
			System.out.println("byeee");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Benz();
		car.engineSecret();
		car.companyVault();
	
	
	}

}
