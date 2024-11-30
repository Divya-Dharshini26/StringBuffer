package com.lao.javaLearning;

//Parameterized constructor
public class Fruits {
	
	String fruit_name;
	String fruit_color;
	Fruits(String name,String color){
		
		fruit_name= name;
		fruit_color= color;

	}
    public void aboutFruits() {
    	System.out.println("Fruit name is " +fruit_name +" and its color is " +fruit_color );
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fruits= new Fruits("Strawberry","Pink");
		fruits.aboutFruits();
		Fruits fruits1 = new Fruits("Orange","Orange");
		fruits1.aboutFruits();


	}

}
