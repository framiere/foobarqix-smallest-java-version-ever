package fr.ramiere.foobarqix;

import lombok.FooBarQix;

@FooBarQix
public class SmallestFooBarQixEver {
	public static void main(String[] args) {
		new SmallestFooBarQixEver().run();
	}

	public void run() {
		for(int i = 1; i < 100; i ++) {
			System.out.println(convert(i));
		}
	}
}
