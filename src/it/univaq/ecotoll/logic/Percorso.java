package it.univaq.ecotoll.logic;

import java.util.*;

import it.univaq.ecotoll.interfaces.*;
import it.univaq.ecotoll.model.Casello;

public class Percorso {
	private Casello in;
	private Casello out;
	
	public Percorso(Casello in, Casello out) {
		//super();
		this.in = in;
		this.out = out;
	}
	
	public Percorso() {
	}

	public Casello getIn() {
		return in;
	}

	public void setIn(Casello in) {
		this.in = in;
	}

	public Casello getOut() {
		return out;
	}

	public void setOut(Casello out) {
		this.out = out;
	}
	
	/**
	 * This method will return a map which contain pairs of the highways traveled with the
	 * relative kilometers traveled on each one.
	 * @return A map of highways and kilometers traveled on them.
	 */
	public Map<Autostrada,Integer> findHighways() {
		
		Map<Autostrada,Integer> route = new HashMap<>();
		
		/*
		 * Qui il metodo costruirà la mappa partendo dal casello di ingresso.
		 * Se entrambi i caselli del Percorso sono sulla stessa autostrada, allora
		 * il metodo termina restituendo la mappa con la singola autostrada e i kilometri,
		 * altrimenti procederà a costruire la rotta utilizzando un algoritmo
		 * apposito che esplorerà la rete autostradale per ricavare il percorso più corto
		 * 
		 */
		
		return route;
		
	}
	
	
	
}
