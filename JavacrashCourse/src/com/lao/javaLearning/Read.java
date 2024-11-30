package com.lao.javaLearning;
//overloading
public class Read {
	
	String read;
	Read(){
		System.out.println("No Argument");
	}
    Read(String toRead){
    	read= toRead;
    	System.out.println("Parameterized " + toRead);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Read read= new Read();
		Read read1= new Read("Constructor");
		
	}

}
