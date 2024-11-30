package com.lao.java_collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public void linkedHashSetExample() {
	Set linkedHashSet= new LinkedHashSet();
	linkedHashSet.add(1);
	linkedHashSet.add("A");
	linkedHashSet.add("B");
	linkedHashSet.add("C");
	linkedHashSet.add(10);
	linkedHashSet.remove(10);
	
	System.out.println("Insertion Order:"+ linkedHashSet);
	System.out.println("size:"+linkedHashSet.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample newlinkedHashSet= new LinkedHashSetExample();
		newlinkedHashSet.linkedHashSetExample();

	}

}
