package com.salesforce.pages;

import org.apache.xmlbeans.impl.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import java.time.Duration;

public class HomePage extends ProjectSpecificMethods {


    public Opportunitypage ClickOpportunity()
    {
     Locators XPATH = Locators.XPATH;
        
        click(locateElement(XPATH, "//button[@title= 'App Launcher']"));
        //getDriver().findElement(By.xpath("//button[@title= 'App Launcher']")).click();
        click(locateElement(XPATH, "//button[@aria-label = 'View All Applications']"));
        click(locateElement(XPATH, "//p[text() ='Sales']"));
         reportStep("sales is Clicked Successfully", "pass");
         //WebElement element =locateElement(XPATH,"/html/body/div[4]/div[1]/section/div[2]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a");
WebElement element =locateElement(XPATH,"(//a[@title='Opportunities'])[1]");
System.out.println("Displayed: " + element.isDisplayed());
System.out.println("Enabled: " + element.isEnabled());
System.out.println("Selected: " + element.isSelected());
System.out.println("Text: " + element.getText());
System.out.println("Enabled: " + element.isEnabled());
System.out.println("Displayed: " + element.isDisplayed());
//WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/section/div[2]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a")));
//element1.click();
//WebElement element = getDriver().findElement(By.xpath("//a[@title='Opportunities']"));

JavascriptExecutor js = (JavascriptExecutor) getDriver();
js.executeScript("arguments[0].click();", element);
System.out.println("Selected: " + element.isSelected());
click(locateElement(XPATH, "//div[@title = 'New']"));
 //'Salesforce Automation by Revathi'

        // isenabled(locateElement(XPATH, "/html/body/div[4]/div[1]/section/div[2]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a"));
//ssssclick(locateElement(XPATH,"/html/body/div[4]/div[1]/section/div[2]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a"));
// click(locateElement(XPATH, "//a[@href='/lightning/o/Opportunity/home']"));
   //     click(locateElement(XPATH,"//span[@class = 'slds-truncate' and text() = 'Opportunities']"));
        reportStep("opportunity is Clicked Successfully", "pass");
        return new Opportunitypage();

}


}