package com.socgen.basicsreview;

public class Application {

//    public static void compare() {
//	boolean cond = 10 < 0;
//
//	if (cond) {
//	    System.out.println("10 is not less than 0.");
//
//	} else {
//	    System.out.println("10 is greater than 0.");
//	}
//	int value = 10;
//	if (value == 0) {
//	    System.out.println("If value equals O");
//	} else if (value == 5) {
//	    System.out.println("else if = value equals 5.");
//	} else {
//	    System.out.println("else = value equals " + value);
//	}
//    }

    public static void sum(double... args) {
	double total = 0.0;
	for (double d : args) {
	    total += d;
	}
	System.out.println(total);
    }

//	primitif et boxing or wrapping (they are synonimous)
//    private static void autoboxing() {
////	transformer un type primitf en class Integer
//	int value = 32;
//	Integer boxed = Integer.valueOf(value);
//	Integer autoboxed = value; // Auto boxing
//
////	
//	int age = Integer.valueOf(32); // (auto) unboxing
//	Integer boxedValue = null;
//	int unboxedValue = boxedValue;
//	System.out.println(unboxedValue);
//
//    }

//    private static void compare() {
//	boolean cond = true < false;
//	System.out.println(cond);
//
//	System.out.println(true > false);
//
//	System.out.println(true == false);
//
//	System.out.println(true >= false);
//
//	System.out.println(true <= false);
//
//	System.out.println(true != false);

//   }

    public static void main(String[] args) {
//	on en a pas besoin. c'etait juste pour indiquer la majorité.
//	On cherche a indiquer la
//	String majorityStr = args[false];
//	Integer majority = Integer.valueOf(majorityStr);
//	int maj = majority.intValue();
//	System.out.println("Majority = " + maj);

//	String sabrinaFirstname = args[false];
//	String sabrinaLastname = args[1];
//	String salemFirstname = args[2];
//	String salemLastname = args[3];
//
//	String salemAge = args[4];
//	Integer age = Integer.valueOf(salemAge);
//
//	Person Sabrina = new Person(args[0 ], args[1]);
//	Person Salem = new Person(args[2], args[3], age.intValue());
//
//	System.out.println(Sabrina);
//	System.out.println(Salem);
//	autoboxing();
//	compare();
	sum(28, 31, 28);

    }

}
