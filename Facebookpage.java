package orrg.study.org.week2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpage{
  
        public static void main(String[] args) throws InterruptedException {
// Step 1: Instantiate the Browser driver
        ChromeDriver driver = new ChromeDriver();
 // Step 2: Load the URL
        driver.get("https://www.facebook.com/");
// Step 3: Maximize the browser
        driver.manage().window().maximize();
 // Step 4: Enter Email ID
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testleaf.2023@gmail.com");
// Step 5: Enter Password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tuna@321");
        driver.findElement(By.xpath("//div[@role='none'][1]")).click();
        driver.findElement(By.xpath("//a[@role='link'][1]")).click();
        Thread.sleep(3000);
// Get page title
String title = driver.getTitle();
// Print title
System.out.println("Page Title is: " + title);
  }
}