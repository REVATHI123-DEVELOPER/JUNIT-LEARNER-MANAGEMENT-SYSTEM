package com.junit5.bookstoreentity;

//in this file we have used the methods
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.junit5.bookstoreentity.book;

public class bookservice {
	
//	here arraylist is used to hold the book content
	
	List<book> listOfBooks = new ArrayList<>();
//add book method to add the books by using the object of book	
	public void addBook(book book)
	{
		listOfBooks.add(book);
	}
//displaying the books	
	public List<book> books()
	{
		return Collections.unmodifiableList(listOfBooks);
		
	}
//when we want to get the books by the id we will use this
	public book getbookbyId(String bookId)
	{
		
		for(book book:listOfBooks)
		{
			if(bookId.equals(book.getBookId()));
			{
				return book;
			}
			
		}
		return null;
		
	}
	
	

}
