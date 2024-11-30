package com.lao.java_collections;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {
	public void LinkedListOperationExample() {
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		System.out.println("LinkedList:"+ linkedList);
		
		linkedList.addFirst(1);
			System.out.println("Linked List after adding first:"+ linkedList);
			
		linkedList.addLast(5);
		System.out.println("Linked List after adding Last:"+ linkedList);
		
		System.out.println("First Value:"+ linkedList.getFirst());
		System.out.println("First Value using index:"+ linkedList.get(3));
		System.out.println("Third Value:"+ linkedList.get(3));
		
		System.out.println("Remove first:"+ linkedList.removeFirst());
		System.out.println(linkedList);
		System.out.println("Remove Last:"+ linkedList.removeLast());
		System.out.println(linkedList);
		
		linkedList.pollLast();
		System.out.println(linkedList);
		
		linkedList.remove();
		System.out.println(linkedList);
		
		linkedList.addFirst(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		System.out.println(linkedList);
		
		linkedList.removeFirstOccurrence(2);
		System.out.println("after removing first occurance of 2"+ linkedList);
		
		linkedList.removeFirstOccurrence(6);
		System.out.println("after removing Last occurance of 6"+ linkedList);
		System.out.println("-------------------------------------------");
		}
		
		//Iterate
		public void iterateLinkedListWithSimpleFor() {
			LinkedList<String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			System.out.println("-------------------------------------------");
			System.out.println("Simple for loop");
			
			for(int index=0; index<linkedList.size();index++) {
			System.out.println("Elements in LL:"+linkedList.get(index));
			}
			System.out.println("-----------------------------------");
			}
		//for each
		public void iterationWithAdvanceFor() {
			LinkedList<String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			System.out.println("For each");
			for(String string: linkedList) {
				System.out.println("elements in LL:"+string);
			}
			System.out.println("-----------------------------------------");
			
		}
         // Iterate using while
		public void iterateUsingWhile() {
			LinkedList<String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			int number=0;
			System.out.println("While loop");
			while(linkedList.size()>number) {
				System.out.println("Elements in LL:"+linkedList.get(number));
				number++;
			}
		}
			//Iterate using Iterator
			
			public void iterateUsingIterator() {
		     LinkedList<String> linkedList= new LinkedList<String>();
		     linkedList.add("a");
			 linkedList.add("b");
			 linkedList.add("c");
			 linkedList.add("d");
			 
		     Iterator<String> iterator= linkedList.iterator();
		     System.out.println("Iterator");
		     while(iterator.hasNext()) {
		    	 System.out.println("Elements in LL:"+iterator.next());

		     }
		     
	
			

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample linkedListExample=new LinkedListExample();
		 linkedListExample.LinkedListOperationExample();
		 linkedListExample.iterationWithAdvanceFor();
		 linkedListExample.iterateUsingWhile();
		 linkedListExample.iterateLinkedListWithSimpleFor();
		 linkedListExample.iterateUsingIterator();

	}

}
