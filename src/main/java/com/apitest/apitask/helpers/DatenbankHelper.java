package com.apitest.apitask.helpers;

import com.apitest.apitask.constants.EndPoints;
import com.apitest.apitask.utils.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


/**
 * This is Helper Class for any future addition of API's related to Datenbank page
 * 
 * @author Jitender Sharma
 *
 */
public class DatenbankHelper {
	private static final String BASE_URL = ConfigManager.getInstance().getString("baseURL");


	public DatenbankHelper() {
		RestAssured.baseURI = BASE_URL;
	}
	/**
	 * Method to get status code of Page
	 * 
	 * @return Int
	 */
	public int getStatusCode() {
		int code = RestAssured.given().contentType(ContentType.HTML).get(EndPoints.GET_DATENBANK).getStatusCode();
		return code;
	}

	/**
	 * Method to get status string of the page
	 * 
	 * @return String
	 */
	public String getStatusMessage() {
		String statusLine = RestAssured.given().contentType(ContentType.HTML).get(EndPoints.GET_DATENBANK).getStatusLine();
		return statusLine;
	}


}
