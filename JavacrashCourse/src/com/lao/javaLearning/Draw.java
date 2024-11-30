package com.lao.javaLearning;

public class Draw {
  //overloading
	String draw;
	
	Draw (){
		System.out.println("No Argument");
	}
	
	Draw(String toDraw){
		draw= toDraw;
		System.out.println("parameterized" + toDraw);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw draw= new Draw();
		Draw draw1= new Draw("Constructor");
		

	}

}
