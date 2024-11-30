package com.lao.string;

public class SingleTryCatch {
    // single try many catch
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1=3;
			int num2=3;
			int result=num1/num2;
			System.out.println(result);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Dont divide num by 0");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Dont divide num by zero");
		}

	}

}
