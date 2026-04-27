package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

    public LoginPage enterUserName(String uName) {
		
		//locate the element
		WebElement locateElement = locateElement("username");
		//type userName
		//type(locateElement, uName);
		clearAndType(locateElement, uName);
		//clear & Type - ClearAndType(locateElement, uName);
		reportStep("Entered  UserName is :"+uName, "pass");
		return this;
	}
	
	public LoginPage enterPassword(String pass) {
		
		type(locateElement("password"), pass);
		reportStep("Entered PassWord is :"+pass, "pass");
		return this;
	}
	
	

	public HomePage clickOnLogin() {
		//click(locateElement("Login"));
		getDriver().findElement(By.id("Login")).click();
		reportStep("Login is Clicked Successfully", "pass");
		return new HomePage();
	}




}
