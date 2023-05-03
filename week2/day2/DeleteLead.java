package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8870970998");
        driver.findElement(By.id("ext-gen334")).click();
        WebElement element = driver.findElement(By.xpath("//a[text()='11455']"));
        System.out.println(element.getText());
       String check=driver.findElement(By.xpath("//a[text()='11455']")).getText();
        driver.findElement(By.xpath("//a[text()='11455']")).click();
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(check);
        driver.findElement(By.id("ext-gen334")).click();
        String text = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
        System.out.println(text);
        driver.close();
        
        
        
	}

}
