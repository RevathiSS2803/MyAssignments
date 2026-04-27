package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.Opportunitypage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{

    @BeforeTest
	public void setValues() {
		excelFileName="Login";
		testcaseName="LoginPage";
		testDescription="Login page";
		authors="Revathi";
		category="Sanity";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void runLoginTC(String uName,String passWord) throws InterruptedException {
		LoginPage user =new LoginPage();
		user.enterUserName(uName)
		    .enterPassword(passWord)
		    .clickOnLogin();
			HomePage user1 = new HomePage();
			user1.ClickOpportunity();
			Opportunitypage opp = new Opportunitypage();
			opp.CreateNewOpporrtunity();
			
	}


}
