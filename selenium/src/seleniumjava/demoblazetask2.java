package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazetask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
//		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("lalisa2gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("lali");
		driver.findElement(By.id("message-text")).sendKeys("hai guys");
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
	}

}
