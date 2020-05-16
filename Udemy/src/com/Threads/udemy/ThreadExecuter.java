package com.Threads.udemy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class task1 extends Thread {
	Lock task1 = new ReentrantLock();

	@Override
	public void run() {

		task1.lock();
		System.out.println("Task 1 start \n");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 1 done ");

		task1.unlock();

	}
}

class task2 implements Runnable {
//	Lock task2 = new ReentrantLock();

	@Override
	public void run() {
		// task2.lock();
		System.out.println("Task 2 start \n");
		for (int i = 200; i <= 301; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 done");
		// task2.unlock();

	}

	class task3 implements Runnable {
		Lock task3 = new ReentrantLock();

		@Override

		public void run() {
			task3.lock();
			System.out.println("Task 3 start \n");
			for (int i = 400; i <= 501; i++) {
				System.out.print(i + " ");
			}
			System.out.println("Task 3 done \n");
			task3.unlock();
		}
	}

	public static class ThreadExecuter {

		public static void main(String[] args) {
			// Task 1
			/*
			 * System.out.println("Task 1 start \n"); for (int i = 1; i <= 100; i++) {
			 * System.out.print(i + " "); } System.out.println("Task 1 done \n");
			 */
			// Task 2

			task1 task1 = new task1();
			task1.start();

			task2 task2 = new task2();

			Thread newTask2 = new Thread(task2);
			newTask2.start();

			// task3 task3 = new task3();
			// Thread newTask3 = new Thread(task3);
			// newTask3.start();

		}
	}
}