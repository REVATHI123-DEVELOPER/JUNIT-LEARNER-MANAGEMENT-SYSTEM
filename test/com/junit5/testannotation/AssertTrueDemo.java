package com.junit5.testannotation;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.print.Book;
import java.util.List;

import org.junit.Test;
import com.junit5.*;
import com.junit5.bookstoreentity.book;
import com.junit5.bookstoreentity.bookservice;

public class AssertTrueDemo {
	@Test
	public void assertTrueWithNoMessage()
	{
		bookservice bookservice = new bookservice();
		
//		in book.java we have given the details of the book
// then here we need to pass the values of the book by using the book object
		
		book java = new book("1","java book","abc");
		
		bookservice.addBook(java);
//		calling the addbook method using the bookservice
//if the books are present then that method will called
//		storin in the entity of book
//still not added any book so rightnow there are no books available
//that's why we have given assertion is true
		List<book> bookss = bookservice.books();
//		the book list is still empty so it will generate the books are empty..
//inserted message for asserttrue for displaying messages
		assertTrue(bookss.isEmpty(),"list of books is not empty!");
		
		
	}
	
	@Test
//	supplier means we are using the testcases that is lambda expressions
	public void assertTrueWithMessageSupplier()
	{
		bookservice bookservice = new bookservice();
		
//		in book.java we have given the details of the book
// then here we need to pass the values of the book by using the book object
		
		book java = new book("1","java book","abc");
		
		bookservice.addBook(java);
//		calling the addbook method using the bookservice
//if the books are present then that method will called
//		storin in the entity of book
//still not added any book so rightnow there are no books available
//that's why we have given assertion is true
		List<book> bookss = bookservice.books();
//		the book list is still empty so it will generate the books are empty..
		assertTrue(bookss.isEmpty(),()->"list of books is not empty!");
		
		
	}
	
	


}
