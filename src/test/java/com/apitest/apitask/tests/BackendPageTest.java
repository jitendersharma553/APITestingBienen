package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.apitest.apitask.helpers.BackendHelper;

import io.qameta.allure.Description;

public class BackendPageTest {

	private BackendHelper backendHelper;


	@BeforeClass
	public void init() {
		backendHelper = new BackendHelper();	
	}

	@Test
	@Description("Test for checking status code of Backend Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(backendHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status message of Backend Page.")
	public void testArchitekurStatusMessage(){
		System.out.println(backendHelper.getStatusMessage());
		Assert.assertTrue(backendHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


