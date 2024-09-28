package com.junit5.testannotation.assertfalse;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.Test;

import com.junit5.bookstoreentity.book;
import com.junit5.bookstoreentity.bookservice;

public class Assertfalse {
	
	
	
//	this assertfalse casereturns pass testcase cause there are no books that's why 

	@Test
	public void assertTrueWithNoMessage()
	{
		bookservice bookservice = new bookservice();
		
//		here we have imported the information..
		book java = new book("1","java book","abc");

//		here the bookservice takes the addbook method of java and includes the info
//  when we make the  book object doesn't present then there is assertion will be false and the message 
		
		bookservice.addBook(java);
		
		List<book> books = bookservice.books();
		
		assertFalse(books.isEmpty(),"List is not empty");
		
//		we can also use the lambda expression for it
		assertFalse(books.isEmpty(),()->"list is not empty");
		
	}
	


}
