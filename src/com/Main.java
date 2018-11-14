package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Voiture[] voitures = new Voiture[3];
		voitures[0] = new Voiture("BMW", 220, 8);
		voitures[1] = new Voiture("Ford", 200, 6);
		voitures[2] = new Voiture("Audi", 240, 8);

		for (Voiture v : voitures) {
			System.out.println(v);
		}

		System.out.println("Le nombre des voitures est : " + voitures.length);
	}
}
