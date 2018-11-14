package com;

public class Voiture {
    //Attribut de l'objet
	private String marque;
	private double vitesse;
	private int puissance;
	
    
	public Voiture(String marque, double vitesse, int puissance) {
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
	}
 
	@Override
	public String toString() {
		return "marque=" + marque + ", vitesse=" + vitesse
				+ ", puissance=" + puissance;
	}
 
}