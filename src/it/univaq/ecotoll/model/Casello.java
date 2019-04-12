package it.univaq.ecotoll.model;

import it.univaq.ecotoll.interfaces.Autostrada;

public class Casello {
	private String name;
	private short relativePosition;
	private Autostrada belongTo;
	
	public Casello() {
		this.name = "nome casello";
		this.relativePosition = 0;
		this.belongTo = null;
	}

	public Casello(String name, short relativePosition, Autostrada belongTo) {
		//super();
		this.name = name;
		this.relativePosition = relativePosition;
		this.belongTo = belongTo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getRelativePosition() {
		return relativePosition;
	}

	public void setRelativePosition(short relativePosition) {
		this.relativePosition = relativePosition;
	}

	public Autostrada getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(Autostrada belongTo) {
		this.belongTo = belongTo;
	}
	
	
	
	
}
