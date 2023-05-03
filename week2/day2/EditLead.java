package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
        driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Janani");
       String title = driver.getTitle();
       System.out.println(title);
        driver.findElement(By.id("ext-gen334")).click();
        driver.findElement(By.xpath("//a[text()='Janani']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TeatleafChennai");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        driver.close();

	}

}
