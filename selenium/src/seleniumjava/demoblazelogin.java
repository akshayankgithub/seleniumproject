package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazelogin {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		driver.findElement(By.id("loginusername")).sendKeys("vian");
		driver.findElement(By.id("loginpassword")).sendKeys("9876");
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")).click();
		

	}

}
