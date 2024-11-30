package com.lao.string;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String is immutable");
        String name= "Divya";
        System.out.println("Append a name to original:"+ name.concat("Dharshini"));
	    System.out.println("Original Name:"+ name);
	    System.out.println("**********************");
	    
	    System.out.println("StringBuffer is mutable");
        StringBuffer name1 = new StringBuffer("Divya");
        System.out.println("Append name to original: " + name1.append("Varsha"));
        System.out.println("Original name: " + name1);
      //METHODS FOR STRING BUFFER  
        //Reverse
	    System.out.println("reversed name:"+name1.reverse());
	    
	    //Replace
	    StringBuffer replaceThis=new StringBuffer("Div");
	    System.out.println(replaceThis.replace(0,3,"Riya"));
	    
	    //Delete
	    StringBuffer delete=new StringBuffer("Divya");
	    System.out.println(delete.delete(0, 5));
	    
	    //Insert
	    StringBuffer insert=new StringBuffer("Amrim");
	    System.out.println(insert.insert(5,"Nisha"));
	    
	    //Capacity
	    System.out.println(insert.capacity());
	    

	}

}
