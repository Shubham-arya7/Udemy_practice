package com.Abstract.com;

abstract public class Animal {

	abstract void bark();
}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("Bow Boww");

	}
}

class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("Meow meooww");
		// TODO Auto-generated method stub

	}

}
