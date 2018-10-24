package com.socgen.javabasics;

/**
 * This class provides. detail description...
 * 
 * @author anne-so
 */

public class Calculator {
    /**
     * This variable provides.
     */

    private double a;
    private double b;

    /**
     * This constructor provides.
     * 
     * @param a operate a
     * @param b operate b
     * 
     */
    public Calculator(double a, double b) {
	this.a = a;
	this.b = b;
    }

    /**
     * This methode provides.
     * 
     * @return a + b
     */
    public double add() {
	return a + b;
    }

    public double substract() {
	return a - b;
    }

    public double multiply() {
	return a * b;
    }

    public double divide() {
	return a / b;
    }

}

/*
 * modifier pour qu'il ai un seul constructor'avec des méthodes public et
 */
