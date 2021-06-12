package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.ArchitekurHelper;
import com.apitest.apitask.helpers.KontaktHelper;

import io.qameta.allure.Description;

public class KontaktPageTest {

	private KontaktHelper kontaktHelper;


	@BeforeClass
	public void init() {
		kontaktHelper = new KontaktHelper();	
	}

	@Test
	@Description("Test for checking status code of Kontakt Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(kontaktHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status message of Kontakt Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(kontaktHelper.getStatusMessage());
		Assert.assertTrue(kontaktHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


