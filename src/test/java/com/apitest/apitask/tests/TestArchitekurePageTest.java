package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.ArchitekurHelper;

import io.qameta.allure.Description;

public class TestArchitekurePageTest {

	private ArchitekurHelper architekurHelper;


	@BeforeClass
	public void init() {
		architekurHelper = new ArchitekurHelper();	
	}

	@Test
	@Description("Test for checking status code of Architekur Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(architekurHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status code of Architekur Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(architekurHelper.getStatusMessage());
		Assert.assertTrue(architekurHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


