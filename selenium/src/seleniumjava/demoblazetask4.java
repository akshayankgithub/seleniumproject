package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazetask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
	WebElement element= driver.findElement(By.xpath("//*[@id=\"recipient-email\"]"));
	  element.sendKeys("kiki@gmail.com");
	  WebElement  element1=driver.findElement(By.xpath("//*[@id=\"recipient-name\"]"));
	  element.sendKeys("kiki");
	  WebElement element2= driver.findElement(By.xpath("//*[@id=\"message-text\"]"));
	  element.sendKeys("software testing");
	  
	  
	   
//	driver.findElement(By.id("signin2")).click();
//  WebElement element=driver.findElement(By.xpath("//*[@id=\"sign-password\"]"));
//  element.sendKeys("kuku");
//  ("")
//  driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
//  driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
	//driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
//  driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a")).click();
//  driver.findElement(By.id("recipient-email")).sendKeys("kiki@gmail.com");
//  driver.findElement(By.id("recipient-name")).sendKeys("kiki");
// 
  
   
  
   
	

	
       
		

	}

}
