package com.lao.conditional_statement;
//if else if
public class FavColor {
	String myFavColor="Black";
	public void colorGuesser() {
		if(myFavColor.equals("Pink")) {
			System.out.println("No its pink");
		}else if(myFavColor.equals("Red")) {
              System.out.println("No its Red");
		}else if(myFavColor.equals("Black")) {
			System.out.println("Yes, You are right");
		}else {
			System.out.println("Sorry!!!! Your are Wrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FavColor color= new FavColor();
		color.colorGuesser();
		

	}

}
