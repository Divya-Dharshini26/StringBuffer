package com.lao.learnstatic;
// static method can be called without object
public class StaticMethod {
	public static void method1() {
    System.out.println("Static method");
	}
	public void method2() {
		
		System.out.println("Nonstatic");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		//Non static method can called withobj only
		StaticMethod method=new StaticMethod();
		method.method2();
		

	}

}
