package com.junit5.bookstoreentity;
//in this book.java we have given the information
public class book {
	private String bookId;
	private String title;
	private String publisher;
//source->generate using constructors using fields
	public book(String bookId, String title, String publisher) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
	}
	
//this will be used for getters and setters generation
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	


}
