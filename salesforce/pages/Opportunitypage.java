package com.salesforce.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class Opportunitypage extends ProjectSpecificMethods {
    public Opportunitypage CreateNewOpporrtunity() throws InterruptedException {
        Locators XPATH = Locators.XPATH;
        clearAndType(locateElement(XPATH, "//input[@name='Name']"), "Salesforce Automation by Revathi");
        reportStep("Opportunity Name is Entered Successfully", "pass");
        // LocalDate today = LocalDate.now();
        // clearAndType(locateElement(XPATH, "//input[@name='CloseDate']"),today.toString());
        clearAndType(locateElement(XPATH, "//input[@name='CloseDate']"), "27/04/2026");
        reportStep("Opportunity Close Date is Entered Successfully", "pass");
        
        WebElement AccName = locateElement(XPATH, "//input[@aria-label ='Account Name']");
        clearAndType(AccName, "Revathi");

        
        Thread.sleep(2000);
        AccName.sendKeys(Keys.ARROW_DOWN);
        AccName.sendKeys(Keys.ARROW_DOWN);
        AccName.sendKeys(Keys.ENTER);

        reportStep("Account Name is Selected Successfully", "pass");
        System.out.println("Account Name is Selected Successfully");

        WebElement stageButton = locateElement(XPATH, "//button[@aria-label = 'Stage']");
        click(stageButton);
        System.out.println("Stage Button is Clicked Successfully");
        
        Thread.sleep(2000);
        stageButton.sendKeys(Keys.ARROW_DOWN);
        stageButton.sendKeys(Keys.ARROW_DOWN);
        stageButton.sendKeys(Keys.ARROW_DOWN);
        stageButton.sendKeys(Keys.ENTER);
        
        
        System.out.println("Stage 'NNNNNNNNeeds Analysis' is Selected Successfully");
        reportStep("Stage is Selected Successfully", "pass");

        click(XPATH, "//button[@name = 'SaveEdit']");
        System.out.println("Save Button is Clicked Successfully");
        reportStep("Opportunity is Created Successfully", "pass");
        System.out.println("Opportunity is Created Successfully");
        String pageTitle = getDriver().getTitle();
        System.out.println("Page Title is: " + pageTitle);
        reportStep("Page Title is: " + pageTitle, "pass");

        return this;

    }

}
