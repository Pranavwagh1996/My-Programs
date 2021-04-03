package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("pranav");
  driver.findElement(By.id("alertbtn")).click();
  System.out.println(driver.switchTo().alert().getText());
 driver.switchTo().alert().accept();
	}
}