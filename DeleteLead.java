package orrg.study.org.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
    public static void main(String[] args) throws InterruptedException {
// Step 1: Instantiate the Browser driver
        ChromeDriver driver = new ChromeDriver();
 // Step 2: Load the URL
        driver.get("http://leaftaps.com/opentaps/");
// Step 3: Maximize the browser
        driver.manage().window().maximize();
        // Step 4: Enter Email ID
        driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
 // Step 5: Enter Password
        driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
        //step 6: Enter Login Button
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        //step 7: Click crm/sfa
        driver.findElement(By.xpath("//img[contains(@src,'integrating')]")).click();
         driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
          driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
          driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
          driver.findElement(By.xpath("//input[@name = 'phoneAreaCode']")).sendKeys("91");
          driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("9987876765");
          driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
           WebElement LeadId = driver.findElement(By.xpath("//div[@unselectable ='on'][24]"));
           String number = LeadId.getAttribute("value");
           System.out.println("Number of Employees: " + number);
           driver.findElement(By.xpath("//div[@unselectable ='on'][24]")).click();
           driver.findElement(By.xpath("//a[text() = 'Delete']")).click();
           driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
          driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
          driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
          driver.findElement(By.xpath("//input[@name = 'phoneAreaCode']")).sendKeys("91");
          driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("9987876765");
          driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
          String result = driver.findElement(By.xpath("//div[@class = 'x-paging-info']")).getText();
          System.out.println("result is:" +result);

}
}
