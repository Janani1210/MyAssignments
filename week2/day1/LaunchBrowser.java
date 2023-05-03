package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

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
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8870970998");
		//Click Create Lead button
		driver.findElement(By.name("submitButton")).click();
		//Verify the lead is created
		//Find the element
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
		String title2 = driver.getTitle();
		System.out.println(title2);
        //Close the browser
        //driver.close();
	}

}
