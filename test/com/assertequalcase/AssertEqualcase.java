package com.assertequalcase;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.junit5.bookstoreentity.book;
import com.junit5.bookstoreentity.bookservice;

public class AssertEqualcase {
	@Test
	public void assertNullWithnoMsg()
	{
		
		
		bookservice bookservice = new bookservice();
		
		
		
		book b1 = new book("1","java","abc");
		book b2 = new book("2","python","abcd");
		
		
		
		bookservice.addBook(b1);
		bookservice.addBook(b2);
//		here create an object at the same way we are calling the bookid by the servicefile
		
//      then we can say that we are comparing the values that we have given in the id of the book
		
		book actualbook = bookservice.getbookbyId("2");

//		In assert equals we are passing the values to the bookid to check the assertequalsmethod
		assertEquals("4",actualbook.getBookId(),()->"error here");
//		if we want to check what's the error message we can use like this
		
		
		
	}


}
