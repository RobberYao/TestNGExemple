package com.testNG.parameterTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class TestParameterXML {

	@Parameters({ "param1", "param2" })
	public void add(int param1, int param2) {
		System.out.println("add param1 : " + param1);
		System.out.println("add param2 : " + param2);
		System.out.println("add param1 + param1 : " + param1 + param2);

	}

	@Parameters({ "param1", "param2" })
	public void subtracte(int param1, int param2) {
		System.out.println("subtracte param1 : " + param1);
		System.out.println("subtracte param2 : " + param2);
		System.out.println("subtracte param1 + param1 : " + param1 + param2);
	}

}
