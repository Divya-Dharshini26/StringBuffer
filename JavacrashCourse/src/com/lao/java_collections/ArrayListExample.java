package com.lao.java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	public void arrayListExample() {
		
		List<String> arrayList= new ArrayList<String>();
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("MG");
		arrayList.add("Bugatti");
		arrayList.add("Bentley");
		
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.indexOf("Maruti"));
		System.out.println(arrayList.lastIndexOf("Bugatti"));
		
		List<String> anotherList= new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		anotherList.clear();
		System.out.println(anotherList);
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.remove("Bugatti");
		System.out.println(arrayList);
		arrayList.add(null);
		System.out.println(arrayList);
		arrayList.set(0, "Thor");
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
		
		//Iterate
		for(String string: arrayList) {
			System.out.println("Using for each:"+ string);
		}
		System.out.println("----------------------------------");
		for(int i=0;i<arrayList.size();i++){
			System.out.println("Using for loop:"+ arrayList.get(i));
		}
		System.out.println("-----------------------------------");
		
		ListIterator<String> list_iterator= arrayList.listIterator();
		while(list_iterator.hasNext()) {
			System.out.println(list_iterator.next());
    	}
		while(list_iterator.hasPrevious()) {
			System.out.println(list_iterator.previous());
		}
		System.out.println("-------------------------------");
		
		Iterator<String> iterator= arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample example= new ArrayListExample();
		example.arrayListExample();

	}

}
