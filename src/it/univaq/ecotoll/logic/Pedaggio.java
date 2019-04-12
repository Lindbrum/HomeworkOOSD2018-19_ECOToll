package it.univaq.ecotoll.logic;

import it.univaq.ecotoll.model.*;

public class Pedaggio {
	/**
	 * This method will calculate the total amount due at the exiting toolboth
	 * @param in The starting point of the route
	 * @param out The ending point of the route
	 * @param vehicle The vehicle detected at the tollboth
	 * @return the total amount due from the driver
	 */
	public static int totalToll (Casello in, Casello out, Veicolo vehicle) {
		
		int total = 0;
		String category = vehicle.getCategory();
		
		/*Qui sarà effetuato il controllo delle autostrade percorse tramite la classe Percorso, con l'istanziazione delle
		 * classi AutostradaConcreta (a1,...,an) e la chiamata ai metodi che calcolano i singoli tratti autostradali.
		 * esempio: 
		 * total = a1.calculateToll(in1,out1,category) + ... + an.calculateToll(inN,outN,category);
		 */
		return total;
	}

}
