package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps/control/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      //input[@class='inputLogin']
	}

}
