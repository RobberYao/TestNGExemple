package com.testNG.dependency;

import org.testng.annotations.Test;

@Test(groups = "GroupsI")
public class DependsOnGroupsI {

	@Test
	public void GroupsI() {
		System.out.println("GroupsI M 1...");
	}

	@Test(dependsOnMethods = "GroupsI")
	public void GroupsI1() {
		System.out.println("GroupsI M 2...");

	}

}
