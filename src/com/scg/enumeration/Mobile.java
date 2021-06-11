package com.scg.enumeration;

public enum Mobile {
	
	SAMSUNG(12000), OPPO(9000), VIVO(8000);
	
	private int price;
	
	private Mobile(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}

}
