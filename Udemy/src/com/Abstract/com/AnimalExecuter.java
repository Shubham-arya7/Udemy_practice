package com.Abstract.com;

public class AnimalExecuter {

	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog() };

		for (Animal name : animals) {
			name.bark();
		}

	}

}
