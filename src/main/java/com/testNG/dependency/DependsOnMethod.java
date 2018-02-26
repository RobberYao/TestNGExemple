package com.testNG.dependency;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void method1() {
		System.out.println("this is method 1");
		// throw new RuntimeException();
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("this is method 2");
	}

}
