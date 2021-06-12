package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.ArchitekurHelper;
import com.apitest.apitask.helpers.ImpressumHelper;

import io.qameta.allure.Description;

public class ImpressumPageTest {

	private ImpressumHelper impressumHelper;


	@BeforeClass
	public void init() {
		impressumHelper = new ImpressumHelper();	
	}

	@Test
	@Description("Test for checking status code of Impressum Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(impressumHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status message of Impressum Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(impressumHelper.getStatusMessage());
		Assert.assertTrue(impressumHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


