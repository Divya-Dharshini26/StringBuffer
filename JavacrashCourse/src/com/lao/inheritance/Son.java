package com.lao.inheritance;

public class Son extends Parents{
public void marriage() {
	System.out.println("No!! Its my wish");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents parents=new Son();
		parents.properties();
		parents.marriage();

	}

}
