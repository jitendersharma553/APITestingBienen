package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.ArchitekurHelper;
import com.apitest.apitask.helpers.FrontendHelper;

import io.qameta.allure.Description;

public class FrontendPageTest {

	private FrontendHelper frontendHelper;


	@BeforeClass
	public void init() {
		frontendHelper = new FrontendHelper();	
	}

	@Test
	@Description("Test for checking status code of Frontend Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(frontendHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status Message of Frontend Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(frontendHelper.getStatusMessage());
		Assert.assertTrue(frontendHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


