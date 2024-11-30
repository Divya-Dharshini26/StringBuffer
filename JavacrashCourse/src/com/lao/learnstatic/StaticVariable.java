package com.lao.learnstatic;
// static variable -->Last updated value will come commonly to othrer obj
public class StaticVariable {
	static int studentAge=1;
	String studentName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable person1= new StaticVariable();
		person1.studentAge=22;
		person1.studentName="Divya";
				
	    StaticVariable person2= new StaticVariable();
		person2.studentAge=23;
		person2.studentName="Sheeba";
		
		System.out.println("Student 1 Age is " + person1.studentAge);
		System.out.println("Student 1 Name is " + person1.studentName );
		System.out.println("Student 2 Age is " + person2.studentAge);
		System.out.println("Student 2 Name is " + person2.studentName );
		

	}

}
