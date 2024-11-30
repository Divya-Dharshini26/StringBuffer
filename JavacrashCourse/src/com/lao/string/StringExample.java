package com.lao.string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=" Divya Dharshini ";
	    int number=3;
	    System.out.println(name);
	    System.out.println(number);
	    
	    //return char value of particular index
	    System.out.println(name.charAt(1));
	    
	    //retun string length
	    System.out.println(name.length());
	    
	    //checks equality of string
	    System.out.println(name.equals("Divya Dharshini"));
	    
	    //checks equality of string with given string without case snsitive
	    System.out.println(name.equalsIgnoreCase("DIVYA DHARSHINI"));
		
	    //Checks if string is empty or not
	    System.out.println(name.isEmpty());
	    
	    //returns true or false based on value given
	    System.out.println(name.contains("a"));
	    
	    //returns all from a particular portion of string
	    System.out.println(name.substring(1));
	    
	   //returns from a particular portion of string to before end portion
	    System.out.println(name.substring(1,3));
	  
	  //Append string to given string
	    System.out.println(name.concat("chandrasekaran"));
	    
	 //replace existing char with given char
	    System.out.println(name.replace("D","d"));
	    System.out.println(name.replace("Divya","Priya"));
	    
	 //Find position of char in string
	    System.out.println(name.indexOf("a"));
	    
	//find char specified from index position
	    System.out.println("What's"+ name.indexOf("i",7));
	    
   //find char specifide from index position
	    System.out.println(name.indexOf("i",2));
	    System.out.println(name.indexOf("shin",2));
	    
   //trim will remove space before& after
	    System.out.println(name.trim());
	    
   //convert the given datatype to string
	    System.out.println(String.valueOf(number));
	    
   //uppercase to lowercase
	    String uppercase="divya";
	    System.out.println(uppercase.toLowerCase());
	    System.out.println(uppercase.toUpperCase());
  //return a joined string with given delimeter
	    System.out.println(String.join("-","Learn","Automation"));
	    System.out.println(String.join("/","26","01","2003"));
  //split 
	    String splitThis="I'm,the,best";
	    String[]spittedwords=splitThis.split(",");
	    for(String string:spittedwords) {
	    	System.out.println(string);
	    }

	    
	    
	    
	    
	    


	}

}
