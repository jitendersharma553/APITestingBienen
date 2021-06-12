package com.apitest.apitask.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.apitest.apitask.helpers.StockwaagenHelper;

import io.qameta.allure.Description;

public class StockwaagenPageTest {

	private StockwaagenHelper stockwaagenHelper;


	@BeforeClass
	public void init() {
		stockwaagenHelper = new StockwaagenHelper();	
	}

	@Test
	@Description("Test for checking status code of Stockwaagen Page.")
	public void testArchitekurStatusCode() {
		Assert.assertEquals(stockwaagenHelper.getStatusCode(), 200, "Status code is not 200");
	} 	


	@Test
	@Description("Test for checking status message of Stockwaagen Page.")
	public void testArchitekurStatusMessage() {
		System.out.println(stockwaagenHelper.getStatusMessage());
		Assert.assertTrue(stockwaagenHelper.getStatusMessage().contains("OK"), "Status message is not OK");
	} 	
}


