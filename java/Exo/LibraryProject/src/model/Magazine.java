package model;

public class Magazine extends Document {
	public Integer number;
	
	public Magazine(String title, int number, boolean available) {
		this.title = title;
		this.number = number;
		this.available = available;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", number=" + number + ", available=" + available + "]";
	}	
	
}