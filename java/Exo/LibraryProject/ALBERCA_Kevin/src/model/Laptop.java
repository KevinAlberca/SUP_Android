package model;

public class Laptop extends Hardware {

	public String brand;
	public OS os;
	
	public Laptop (String brand, OS os, boolean available, boolean broken){
		this.brand = brand;
		this.os = os;
		this.available = available;
		this.broken = broken;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public OS getOs() {
		return os;
	}

	public void setOs(OS os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", os=" + os + ", available=" + available + ", broken=" + broken + "]";
	}
	
}
