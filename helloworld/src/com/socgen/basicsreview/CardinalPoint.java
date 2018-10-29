package com.socgen.basicsreview;

public enum CardinalPoint {
//	ici nous avons déclarés des constantes qui sont des instances de CardinalPoint. Rappel : les constantes sont en majuscules.Il faut faire attention à l'ordre de déclarations.
//	si le constructor n'a pas d'arguments celui qui a des arguments prend le dessus.
// 	si on veut déclarer une methode, il faut mettre un point virgule.

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
    // ici on a déclaré une méthode avec un corps vide.
    public abstract String getPreferedSport();

}
