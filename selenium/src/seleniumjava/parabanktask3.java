package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class parabanktask3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        
         //driver.findElement(By.id("customer.firstName")).sendKeys("Akshaya");
//        driver.findElement(By.id("customer.lastName")).sendKeys("nk");
//        driver.findElement(By.id("customer.address.street")).sendKeys("karthika");
//        driver.findElement(By.id("customer.address.city")).sendKeys("vatkara");
//        driver.findElement(By.id("customer.address.state")).sendKeys("kerala");
//        driver.findElement(By.id("customer.address.zipCode")).sendKeys("4567");
//        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7865453425");
//        driver.findElement(By.id("customer.ssn")).sendKeys("786543247");
//        driver.findElement(By.id("customer.username")).sendKeys("satheesh@nk");
//        driver.findElement(By.id("customer.password")).sendKeys("123@kk12345678");
//        driver.findElement(By.id("repeatedPassword")).sendKeys("123@kk12345678");
       // driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("satheesh@nk");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("123@kk12345678");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
        Thread.sleep(4000);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.linkText("Admin Page")).click();
        driver.findElement(By.id("endpoint")).sendKeys("678");
        driver.findElement(By.xpath("//*[@id=\"adminForm\"]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
        driver.close();
        
        //driver.close();
	}

}
