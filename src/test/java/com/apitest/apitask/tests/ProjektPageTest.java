package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.ProjektHelper;
import io.qameta.allure.Description;

public class ProjektPageTest {

	private ProjektHelper projektHelper;


	@BeforeClass
	public void init() {
		projektHelper = new ProjektHelper();	
	}

	@Test
	@Description("Test for checking status code of projekt Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(projektHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status message of projekt Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(projektHelper.getStatusMessage());
		Assert.assertTrue(projektHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


