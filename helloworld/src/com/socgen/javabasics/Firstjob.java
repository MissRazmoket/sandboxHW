package com.socgen.javabasics;

public class Firstjob {

    public static void main(String[] args) {

//	String explosion = "explosion";
//	char[] explosed = explosion.toCharArray();
//	for (int i = 0; i < explosed.length; i++) {
//	    System.out.println(explosed[i]);
//	}

	// String[] expl = new String["explosion"];
	// for (String i = 0; expl.toString(); i++)
	// System.out.println(i);

//	boolean bool[] = { true, false, true, false, true, false };
//	for (int i = 0; i < bool.length; i++) {
//	    System.out.println("L'index " + i + " a pour valeur " + bool[i]);
//	}
//
//	boolean bool1[] = { true, false, true, false, true, false };
//	for (int i = bool1.length - 1; i >= 0; i--) {
//	    System.out.println("L'index " + i + " a pour valeur : " + bool1[i] + ".");
//
//	}
//
//	System.out.println(" ");
//
//	int tabInt[] = new int[];
//	for (int i = 0; i < tabInt.length; i++) {
//	    System.out.println("Le chiffre " + tabInt[i] + " a  pour index " + i);
//	}

//	boolean answer[] = { true, false };

	int i, j;

	loop1: for (i = 1; i <= 10; i++) {
	    System.out.println();
	    loop2: for (j = 1; j <= 10; j++) {
		System.out.print(j + " ");

		if (j == 5)
		    break loop1; // Statement 1
	    }
	}
    }

}
