package orrg.study.org.week3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class CrearteAccount {
  public static void main(String[] args) throws InterruptedException {
// Step 1: Instantiate the Browser driver
        
        ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
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
        System.out.println("Click crm/sfa");
        //step 8: Click Accounts  
        driver.findElement(By.xpath("//a[text()='Accounts']")).click();
         System.out.println("Click Accounts");
        //step 9: Click Create Account
        driver.findElement(By.xpath("//a[contains(@href,'AccountForm')][1]")).click();
         System.out.println("Click createAccount");

         driver.findElement(By.xpath("//input[@id = 'accountName']")).sendKeys("Revathitestleaf");
         System.out.println("AccountNAme");
         //WebElement Acc = driver.findElement(By.xpath("//span[@class = 'requiredField']"));
         //System.out.println("Acc");
         
         driver.findElement(By.xpath("//textarea[@name = 'description']")).sendKeys("Selenium Automation Tester");
         WebElement industry = driver.findElement(By.xpath("//select[@name = 'industryEnumId']"));
// create Select object
Select dropDown = new Select(industry);
// select the 3rd option (index starts from 0)
dropDown.selectByIndex(2);
WebElement ownership = driver.findElement(By.xpath("//select[@name ='ownershipEnumId']"));
Select ownerDrop = new Select(ownership);
ownerDrop.selectByVisibleText("S-Corporation");
WebElement Source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
Select sourcedrop = new Select(Source);
sourcedrop.selectByValue("LEAD_EMPLOYEE");
WebElement Marketing = driver.findElement(By.xpath("//select[@id = 'marketingCampaignId']"));
Select Marketdrop = new Select(Marketing);
Marketdrop.selectByIndex(5);
WebElement state = driver.findElement(By.xpath("//select[@name = 'generalStateProvinceGeoId']"));
Select statedrop = new Select(state);
statedrop.selectByValue("TX"); 
driver.findElement(By.xpath("//input[@type ='submit']")).click();
}
}

