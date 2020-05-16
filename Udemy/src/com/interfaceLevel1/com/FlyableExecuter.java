package com.interfaceLevel1.com;

public class FlyableExecuter {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable objects : flyingObjects) {
			objects.fly();
		}
	}

}
