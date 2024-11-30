package com.lao.string;
//Exception handling
public class You  {
	public void makeGfLaugh() {
		try {
			throw new MachanInterrupedException("machan is coming to hit you");
		}catch(MachanInterrupedException e) {
			System.out.println("Friend:Macha give pose da");
			System.out.println("And you act like giving pose for instagram post");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		You you=new You();
		you.makeGfLaugh();
		

	}

}
