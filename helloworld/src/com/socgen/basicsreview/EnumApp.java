package com.socgen.basicsreview;

public class EnumApp {

    public static void main(String[] args) {

	CardinalPoint[] points = CardinalPoint.values();

	for (CardinalPoint cardinalpoint : points) {
	    System.out.println(cardinalpoint + " prefered " + cardinalpoint.getPreferedSport() + ".");
	}

	System.out.println(CardinalPoint.getPreferedSport());

    }

}
