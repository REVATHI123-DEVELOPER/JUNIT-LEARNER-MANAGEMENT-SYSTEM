package com.junit5.lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;

public class lifecycle {
	
//steps : 1.beforeall
//step 2 : beforeeach
//step 3: first test case
//step 4: aftereach 
//step 5: testcase
//step 6: aftereach
//step 7: disconnect from db
	
	
//for constructor?
	
	public lifecycle()
	{
		System.out.println("constructor is called");
		
	}
//as per the process constructor is called first
	
	
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("connect to the database");
		
	}
	
	@BeforeEach
	void beforeEach()
	{
		System.out.println("load the schema");
		
	}
	
	@AfterEach
	void AfterEach()
	{
		System.out.println("drop the schema");
	}
	
	@AfterAll
	static void afterall()
	{
		System.out.println("disconnect from the database");
	}
	
	@Test
	void firsttest()
	{
		System.out.println("first test case!!!....");
	}
	
	@Test
	void secondtest()
	{
		System.out.println("second test case!!!....");
	}



}
