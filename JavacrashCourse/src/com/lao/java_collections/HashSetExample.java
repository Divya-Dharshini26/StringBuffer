package com.lao.java_collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
	public void basicExampleHashSet() {
		HashSet<String> hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A");
		hashSet.add(null);
		hashSet.add("G");
		
		System.out.println("Contents of Hashset:"+ hashSet);
		hashSet.remove(null);
		System.out.println("contents of Hashset:"+ hashSet);
		System.out.println(hashSet.contains("A"));
	
	}
	public void iterateUsingIterator() {
	 HashSet<String> hashSet= new HashSet<String>();
	    hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("A");
		
		System.out.println("Iterator");

		Iterator<String> iterator= hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println("Elements of hashset:"+ iterator.next());
			
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample hashSetExample= new HashSetExample();
		hashSetExample.basicExampleHashSet();
		hashSetExample.iterateUsingIterator();
		

	}

}
