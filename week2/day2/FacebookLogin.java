package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Janani");
        driver.findElement(By.name("lastname")).sendKeys("R");
        driver.findElement(By.name("reg_email__")).sendKeys("jananijanu1210@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("JananiM");
        WebElement element = driver.findElement(By.name("birthday_day"));
        Select source=new Select(element);
        source.selectByIndex(11);
        WebElement element2 = driver.findElement(By.name("birthday_month"));
        Select source2=new Select(element2);
        source2.selectByIndex(9);
        WebElement element3 = driver.findElement(By.name("birthday_year"));
        Select source3=new Select(element3);
        source3.selectByVisibleText("1994");
        driver.findElement(By.className("_58mt")).click();
        
        
        
        
        
        
        
        
        
        
	}

}
