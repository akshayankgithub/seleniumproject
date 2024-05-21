package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazecart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("lali");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.id("city")).sendKeys("calicut");
		driver.findElement(By.id("card")).sendKeys("123456");
		driver.findElement(By.id("card")).sendKeys("123456");
		driver.findElement(By.id("month")).sendKeys("march");
		driver.findElement(By.id("Year")).sendKeys("1998");
		
		
	}
	

}
