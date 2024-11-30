package com.lao.java_collections;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {
	public void treeSetExample() {
		TreeSet<Integer> treeSet= new TreeSet <Integer>();
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(3);
		
		System.out.println("Elements are sorted in ascending order:"+ treeSet);
		//First element
		System.out.println("First element:"+treeSet.first());
		//Last element
		System.out.println("Last element:"+treeSet.last());
		//headSet----> values lesser than the given element and without that given
		System.out.println("Head set:"+treeSet.headSet(3));
		//tailSet----> values higher than the given element and including that given
		System.out.println("Tail Set:"+ treeSet.tailSet(7));
		//subset---->inbetween values include given 1st value
		System.out.println("Subset:"+ treeSet.subSet(2,9));
		//Comparator---->return null if sorting is in natural order
		System.out.println("Comparator:"+treeSet.comparator());
		System.out.println("Higher:"+ treeSet.higher(3));
		System.out.println("Lower:"+treeSet.lower(2));
		System.out.println("poll first:"+treeSet.pollFirst());
		System.out.println("Poll Last:"+treeSet.pollLast());
		System.out.println("After polling it will delete poll value:"+treeSet);
		System.out.println("Decending order Set:"+ treeSet.descendingSet());
	
		//Normal Iterator
		Iterator<Integer> iterator= treeSet.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
	
		}
		
		//descending iterator
		
		Iterator<Integer> descIterator= treeSet.descendingIterator();
		while(descIterator.hasNext()) {
		System.out.println(descIterator.next());
	
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetExample treeSetExample= new TreeSetExample();
		treeSetExample.treeSetExample();
		
		

	}

}
