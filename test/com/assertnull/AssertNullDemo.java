package com.assertnull;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

import com.junit5.bookstoreentity.book;
import com.junit5.bookstoreentity.bookservice;

public class AssertNullDemo {
	
	@Test
	public void assertNullWithnoMsg()
	{
		
		bookservice bookservice = new bookservice();
		
		book b1 = new book("1","java","abc");
		book b2 = new book("2","sql","abc");
		
		
		bookservice.addBook(b1);
		bookservice.addBook(b2);
//	if we given the wrong book id we can take it as the assertnull testcase will be fail we can give the asertnotnull value forit..
//		if we give the correc bookid we can say that testcase will be definetly pass
		
		book actualbook = bookservice.getbookbyId("2");
		
		
		assertNotNull(actualbook,"book id is not present");

//		assertNull(actualbook,"book is not present");

		
	}


}
