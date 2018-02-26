package com.AaronCGoidel.APCS.class_work.debug_practice;

public class RouteCipherTester {
	public static void main(String[] args) {
		RouteCipher rc = new RouteCipher(2, 3);
		System.out.println(rc.encryptMessage(""));
		System.out.println(rc.encryptMessage("Seven ducks"));
		System.out.println(rc.encryptMessage("Eleven ducks"));
		System.out.println(rc.encryptMessage("  "));

		rc = new RouteCipher(1, 7);
		System.out.println(rc.encryptMessage("bring LP"));

		rc = rc = new RouteCipher(7, 1);
		System.out.println(rc.encryptMessage("bring LP"));

		rc = new RouteCipher(1, 1);
		System.out.println(rc.encryptMessage("Two ducks"));

		rc = new RouteCipher(2, 4);
		System.out.println(rc.encryptMessage("Surprise"));
	}
}