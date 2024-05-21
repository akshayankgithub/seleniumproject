package seleniumjava;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class seleniumtask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		WebElement element= driver.findElement(By.id("APjFqb"));
		element.sendKeys("cat");
		element.sendKeys(Keys.ENTER);
		driver.close();
	}

}
