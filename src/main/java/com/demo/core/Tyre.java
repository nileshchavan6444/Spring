package com.demo.core;

public class Tyre {
	
	private String brand;
	private String size;
	private int price;

	
	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tyre(String brand, String size, int price) {
		System.out.println("in tyre construct");
		this.brand = brand;
		this.size = size;
		this.price =price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("using setter: brand ===" + brand);
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		System.out.println("using setter size ===" + size);
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}
	
	
}
