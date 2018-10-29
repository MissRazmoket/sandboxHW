package com.socgen.basicsreview;

public enum CardinalPoint {
//	ici nous avons d�clar�s des constantes qui sont des instances de CardinalPoint. Rappel : les constantes sont en majuscules.Il faut faire attention � l'ordre de d�clarations.
//	si le constructor n'a pas d'arguments celui qui a des arguments prend le dessus.
// 	si on veut d�clarer une methode, il faut mettre un point virgule.

    NORTH(false) {
	@Override
	public String getPreferedSport() {
	    return "Ski";
	}
    },
    SOUTH(true) {
	@Override
	public String getPreferedSport() {
	    return "Rugby";
	}
    },
    EAST(false) {
	@Override
	public String getPreferedSport() {
	    return "Judo";
	}
    },
    WEST(true) {
	@Override
	public String getPreferedSport() {
	    return "Rodeo";
	}
    };

    private boolean hot = false;

    private CardinalPoint(boolean hot) {
	this.hot = hot;
    }

    public boolean isHot() {
	return hot;
    }

    // constant - specific method
    // ici on a d�clar� une m�thode avec un corps vide.
    public abstract String getPreferedSport();

}
