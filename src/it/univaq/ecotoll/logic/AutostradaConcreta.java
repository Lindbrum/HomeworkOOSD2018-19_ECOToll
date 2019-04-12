package it.univaq.ecotoll.logic;

import java.util.*;

import it.univaq.ecotoll.interfaces.Autostrada;
import it.univaq.ecotoll.model.Casello;

public class AutostradaConcreta implements Autostrada {
	private List<Casello> tollbooths;
	private List<Autostrada> nearbyHighways;
	private int fee;
	
	public AutostradaConcreta(List<Casello> tollbooths,List<Autostrada> nearbyHighways, int fee) {
		super();
		this.tollbooths = tollbooths;
		this.nearbyHighways = nearbyHighways;
		this.fee = fee;
		
	}
	
	public AutostradaConcreta() {
		this.tollbooths = new ArrayList<>();
		this.nearbyHighways = new ArrayList<>();
		this.fee = 0;
	}
	
	
	@Override
	public int calculateToll(Casello begin, Casello end, String category) {
		
		/*int toll;
		
		//Calculate the route length
		int pos1 = begin.getRelativePosition();
		int pos2 = end.getRelativePosition();
		int routeLenght = Math.abs(pos2 - pos1);
		
		
		
		return toll;*/
		return 0;
	}

	public List<Casello> getTollbooths() {
		return tollbooths;
	}

	public void setTollbooths(List<Casello> tollbooths) {
		this.tollbooths = tollbooths;
	}

	public List<Autostrada> getNearbyHighways() {
		return nearbyHighways;
	}

	public void setNearbyHighways(List<Autostrada> nearbyHighways) {
		this.nearbyHighways = nearbyHighways;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}
