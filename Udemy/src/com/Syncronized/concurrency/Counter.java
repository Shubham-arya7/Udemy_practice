package com.Syncronized.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private int i = 0;

	private int j = 0;

	Lock lockfori = new ReentrantLock();

	Lock lockforj = new ReentrantLock();

	public void increamentI() {
		lockfori.lock();
		i++;
		lockfori.unlock();
	}

	public void increamentJ() {
		lockforj.lock();
		j++;
		lockforj.unlock();
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	@Override
	public String toString() {
		return i + " " + j;

	}

}
