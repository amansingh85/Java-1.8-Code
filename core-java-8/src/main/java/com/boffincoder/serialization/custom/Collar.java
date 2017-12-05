package com.boffincoder.serialization.custom;

/**
 * 
 * @author Amandeep Singh
 * 
 *
 */
public class Collar {
	private int size;
	
	public Collar(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Collar [size=" + size + "]";
	}
}
