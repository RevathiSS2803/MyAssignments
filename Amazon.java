package orrg.study.org.marathon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List; 


public class Amazon {
    public static void main(String[] args) throws InterruptedException {
// Step 1: Instantiate the Browser driver
        ChromeDriver driver = new ChromeDriver();
 // Step 2: Load the URL
        driver.get("https://www.amazon.in/");
// Step 3: Maximize the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Object keys;
        //step 4: Seach bags for boys
        driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("bags for boys",Keys.ENTER);

        //List <WebElement> spans = (List<WebElement>) driver.findElement(By.xpath("//h2//span"));
        //for(WebElement sp : spans ){
        //System.out.println(sp.getText());}

        String topic = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
        System.out.println(topic);
        

    


}
}
