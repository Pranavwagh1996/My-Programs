package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class practice {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");

		Thread.sleep(2000);

	List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));

	for(WebElement option: AllOptions) {
		String actText = option.getText();
		String expText ="redmi";
		if(actText.equals(expText)) {
			option.click();
		}
		
	}
	
	
	}
}