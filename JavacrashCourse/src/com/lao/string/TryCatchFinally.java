package com.lao.string;

public class TryCatchFinally {
	public static int dummy() {
		return 3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside Try block");
			System.out.println(TryCatchFinally.dummy());
			System.out.println("After exception");
			
		}catch(Exception e) {
			System.out.println("Inside Catch block");
			
		}finally {
			System.out.println("Inside Finally block");
		}

	}

}
