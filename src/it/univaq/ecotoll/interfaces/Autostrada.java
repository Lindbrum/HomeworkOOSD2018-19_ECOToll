package it.univaq.ecotoll.interfaces;

import it.univaq.ecotoll.model.Casello;

public interface Autostrada {
	
	
	/**
	 * This method shall calculate the toll for this highway.
	 * @param begin the starting point of the route
	 * @param end the ending point of the route
	 * @param category the vehicle category, will affect the fee
	 * @return the toll to be paid on this highway. In case the
	 * driver route covered different highways, the result will be summed to
	 * the other tolls from the Toll class.
	 */
	public int calculateToll(Casello begin, Casello end, String category);
	
	
}
