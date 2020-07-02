package com.st.demo.model;

public class Library 
{
	private int lid;
	private String bookName;
	private String author;
	
	public Library() 
	{
	
	}

	public Library(int lid, String bookName, String author) {
		super();
		this.lid = lid;
		this.bookName = bookName;
		this.author = author;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
