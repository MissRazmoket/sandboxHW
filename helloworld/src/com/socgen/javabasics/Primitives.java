package com.socgen.javabasics;

public class Primitives {

    public static void main(String[] args) {

	Calculator calc2 = new Calculator(10, 10);

	System.out.println(calc2.multiply());
	System.out.println(calc2.add());
	System.out.println(calc2.substract());
	System.out.println(calc2.divide());

	System.out.println(calc2.multiply() / calc2.add());

    }
}
