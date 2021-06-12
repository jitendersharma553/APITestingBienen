package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.ArchitekurHelper;
import com.apitest.apitask.helpers.MesswerteHelper;

import io.qameta.allure.Description;

public class MesswertePageTest {

	private MesswerteHelper messwerteHelper;


	@BeforeClass
	public void init() {
		messwerteHelper = new MesswerteHelper();	
	}

	@Test
	@Description("Test for checking status code of Messwerte Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(messwerteHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status message of Messwerte Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(messwerteHelper.getStatusMessage());
		Assert.assertTrue(messwerteHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


