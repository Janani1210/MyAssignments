package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

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
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Janu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Non It to IT Transformation Programming Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jananijanu1210@gmail.com");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source=new Select(element);
		source.selectByIndex(4);
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select source2=new Select(element2);
		source2.selectByVisibleText("Automobile");
		WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//Create object for Select class
        Select source3=new Select(element3);
       source3.selectByValue("OWN_CCORP");
       
        //Select methods
		
		//Click Create Lead button
		driver.findElement(By.name("submitButton")).click();


	}

}
