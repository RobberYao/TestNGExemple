package com.testNG.timeOut;

import org.testng.TestException;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestTimeout {

	@Test(timeOut = 500)
	public void method1() throws InterruptedException {
		System.out.println("timeOut 500 sleep 400");
		Thread.sleep(400);
	}

	@Test(timeOut = 400)
	public void method2() throws InterruptedException {
		System.out.println("timeOut 400 sleep 400");
		Thread.sleep(400);
	}

	@Test(timeOut = 300, expectedExceptions = ThreadTimeoutException.class)
	public void method3() throws InterruptedException {
		System.out.println("timeOut 300 sleep 400");
		Thread.sleep(400);
	}
}
