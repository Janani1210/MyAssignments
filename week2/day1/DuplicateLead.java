package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
		//To verify the page Loaded
		//To Print the title of  the page
		String title = driver.getTitle();  //Ctrl+2
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Leads")).click();
		//Click create Lead
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Janu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Non It to IT Transformation Programming Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jananijanu1210@gmail.com");
		//Click Create Lead button
		driver.findElement(By.name("submitButton")).click();
		//Verify the lead is created
		//Find the element
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestleafOrganisation");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JananiJan");
		driver.findElement(By.className("smallSubmit")).click();
		String title3 = driver.getTitle();
		System.out.println(title3);
	}

}
