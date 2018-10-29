package com.socgen.javabasics;

public class Trainingmethodes {

    public static int sum(int i1, int i2) {
	int result = 0;
	for (int i = 0; i <= i2; i++)
	    result += 1;
	return result;
    }

    public static void main(String[] args) {
	System.out.println("Sum from 1 to 10 is " + sum(1, 10));

	System.out.println(600000 * 30 * 12);
    }

}
