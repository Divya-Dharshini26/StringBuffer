package com.lao.javaLearning;
//Parameterized constructor

public class Animals {
	String animal_name;
	String animal_type;
	Animals(String name,String type){
		animal_name= name;
		animal_type= type;
	}
		public void sayAboutAnimals() {
			System.out.println("Animal name is "+ animal_name+" and it is " + animal_type);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animals animal1= new Animals("Duck","omnivores");
        animal1.sayAboutAnimals();
        Animals animal2= new Animals("Lion","omnivores");
        animal2.sayAboutAnimals();
        
        
	}
	

}
