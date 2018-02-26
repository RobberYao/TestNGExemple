package com.testNG.expectedExceptions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExpectedException {
	
	@Test(timeOut = 300, expectedExceptions = ThreadTimeoutException.class)
	public void method3() throws InterruptedException {
		System.out.println("timeOut 300 sleep 400");
		Thread.sleep(400);
	}
	
}
