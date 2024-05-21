package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumtask2 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver =new ChromeDriver();
         driver.get("https://www.saucedemo.com/v1/");
         driver.manage().window().maximize();
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         Thread.sleep(4000);
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         Thread.sleep(4000);
         driver.findElement(By.id("login-button")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
       
         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
        
         driver.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.id("about_sidebar_link")).click();
         driver.get("https://www.saucedemo.com/v1/inventory.html");
         Thread.sleep(2000);
         
        
         driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
         //Thread.sleep(4000);
         driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
        driver.get("https://www.saucedemo.com/v1/cart.html");
        //Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
        //Thread.sleep(4000);
        driver.get("https://www.saucedemo.com/v1/cart.html");
        driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
        Thread.sleep(4000);

        
        driver.findElement(By.id("first-name")).sendKeys("kukku");
     //   driver.get("https://www.saucedemo.com/v1/checkout-step-one.html");
        driver.findElement(By.id("last-name")).sendKeys("nk");
        driver.findElement(By.id("postal-code")).sendKeys("1234");
       Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click(); 
        driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
        Thread.sleep(4000);
//        WebElement sidebar = driver.findElement(By.xpath("menu_button_container"));
//        Thread.sleep(4000);
//
//        // Click on the sidebar element using Actions class for better handling
//        Actions actions = new Actions(driver);
//        actions.moveToElement(sidebar).click().perform();
//        Thread.sleep(2000);
//
//        // Wait for the sidebar to expand (replace "button_xpath" with the actual XPath of the button)
//        WebElement button = driver.findElement(By.cssSelector("//*[@id=\"inventory_sidebar_link\"]"));
//
//        // Click on the button within the sidebar
//        button.click();
        
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        
        driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Name (Z to A)");
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Price (low to high)");
        driver.navigate().refresh();
        driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Price (high to low");
        driver.navigate().refresh();
        driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Name (A to Z)");
        driver.findElement(By.cssSelector("#item_4_img_link > img")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#inventory_item_container > div > div > div > button")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#inventory_item_container > div > div > div > button")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#inventory_item_container > div > button")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#menu_button_container > div > div:nth-child(3) > div > button")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
        }
	


	}


