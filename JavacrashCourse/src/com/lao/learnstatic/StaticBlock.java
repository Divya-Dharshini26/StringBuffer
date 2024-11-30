package com.lao.learnstatic;

public class StaticBlock {
	static {
		System.out.println("Static block 1");
	}
	static {
        System.out.println("Static block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Main method");
	}

}
