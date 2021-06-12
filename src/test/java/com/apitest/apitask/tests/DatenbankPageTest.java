package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.ArchitekurHelper;
import com.apitest.apitask.helpers.DatenbankHelper;

import io.qameta.allure.Description;

public class DatenbankPageTest {

	private DatenbankHelper datenbankHelper;


	@BeforeClass
	public void init() {
		datenbankHelper = new DatenbankHelper();	
	}

	@Test
	@Description("Test for checking status code of Datenbank Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(datenbankHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status message of Datenbank Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(datenbankHelper.getStatusMessage());
		Assert.assertTrue(datenbankHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


