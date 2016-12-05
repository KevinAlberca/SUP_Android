package model;

public class Book extends Document {
	public String author;
	
	public Book(String title, String author, boolean available){
		this.title = title;
		this.author = author;
		this.available = available;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title = "+ title +", author=" + author + ", available=" + available + "]";
	}
	
}
