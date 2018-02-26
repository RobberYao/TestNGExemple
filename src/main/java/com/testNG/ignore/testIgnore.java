package com.testNG.ignore;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class testIgnore {

	@Test(enabled = true)
	public void method1() {
		System.out.println("testIgnore m 1");
	}

	@Test(enabled = true)
	public void method2() {
		Assert.assertEquals(true, true);
	}

	@Test(enabled = true)
	public void method3() {
		Assert.assertEquals(false, true);
	}

	@Test(enabled = false)
	public void method4() {
		Assert.assertEquals(false, true);
	}

}
