package com.testNG.dependency;

import org.testng.annotations.Test;

@Test(groups = "GroupsII", dependsOnGroups = "GroupsI")
public class DependsOnGroupsII {

	@Test
	public void GroupsII1() {
		System.out.println("GroupsII M 1....");
		// throw new RuntimeException();
	}

	@Test(dependsOnMethods = { "GroupsII1" })
	public void GroupsII2() {
		System.out.println("GroupsII M 2....");
	}
}
