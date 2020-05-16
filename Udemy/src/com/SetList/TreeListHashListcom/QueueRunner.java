package com.SetList.TreeListHashListcom;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Stringcomparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>(new Stringcomparator());

		// queue.add("Apple");
		queue.addAll(List.of("Zebra", "Hipopotamus", "Lion", "Tiger"));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}

}
