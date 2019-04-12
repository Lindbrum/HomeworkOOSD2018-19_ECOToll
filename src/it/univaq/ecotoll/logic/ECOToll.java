package it.univaq.ecotoll.logic;

import java.util.*;


import it.univaq.ecotoll.model.*;

public class ECOToll {

	public static void main(String[] args) {
		
		/*Veicolo-> String model, String brand, short year, String plate, short axes,
		 *  int weight, int height
		 *  
		 */
		Veicolo v1 = new Veicolo("Punto","Fiat",(short) 2012,"AX293134",(short) 2,1000,120);
		Veicolo v2 = new Veicolo("XL192","Setra",(short) 2007,"BS129003",(short) 2,2000,320);
		Veicolo v3 = new Veicolo("G3567","UltraWeight",(short) 2016,"FD44537",(short) 3,7000,350);
		Veicolo v4 = new Veicolo("XL192","ChinaTransports",(short) 2007,"CN777777",(short) 4,12000,350);
		Veicolo v5 = new Veicolo("TB7000","ExceptionTransport",(short) 2012,"AX293134",(short) 5,15000,400);
		
		/*
		 * Autostrada -> List<Casello> tollbooths,List<Autostrada> nearbyHighways, int fee
		 */
		AutostradaConcreta a24 = new AutostradaConcreta(null,null,1);
		
		/*
		 * Casello -> String name, short relativePosition, Autostrada belongTo
		 */
		
		Casello c1 = new Casello("L'Aquila ovest",(short) 57, a24);
		Casello c2 = new Casello("Assergi",(short) 42, a24);
		Casello[] array = {c1,c2};
		a24.setTollbooths(new ArrayList<Casello>(Arrays.asList(array)));
		
		Pedaggio.totalToll(c1, c2, v1);
		Pedaggio.totalToll(c1, c2, v2);
		Pedaggio.totalToll(c1, c2, v3);
		Pedaggio.totalToll(c1, c2, v4);
		Pedaggio.totalToll(c1, c2, v5);
		
		
	}

}
