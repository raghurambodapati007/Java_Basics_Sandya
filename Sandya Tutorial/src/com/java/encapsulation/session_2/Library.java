package com.java.encapsulation.session_2;

public class Library {

	private int bookId;
	private	String bookName;
	
	public Library() {}
	
	public Library(int bookId,String bookName) {
		
		this.bookId=bookId;
		this.bookName=bookName;
		
	}
	
	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookName=" + bookName + "]";
	}

	//Getters and setters 
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
}
