package com.lao.inheritance;
//Overloading 
public class TheWayWeTalk {
	public void talk(Parents styleoftalking) {
		System.out.println("polite,Care");
	}
	public void talk(Friends styleoftalking) {
		System.out.println("Funny,Care");
	}
	public void talk(Boss styleoftalking) {
		System.out.println("Nothing personal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheWayWeTalk talk=new TheWayWeTalk();
		
		Parents parents=new Parents();
		talk.talk(parents);
		
		Friends friends=new Friends();
		talk.talk(friends);
		
		Boss boss=new Boss();
		talk.talk(boss);



	}

}
