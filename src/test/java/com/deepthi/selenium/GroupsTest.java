package com.deepthi.selenium;

import org.testng.annotations.Test;

public class GroupsTest {
	
	  @Test(groups = { "sanitytest", "checkintest" })
	  public void testMethod1() {
	  }
	 
	  @Test(groups = {"sanitytest", "checkintest"} )
	  public void testMethod2() {
	  }
	 
	  @Test(groups = { "sanitytest" })
	  public void testMethod3() {
	  }

}
