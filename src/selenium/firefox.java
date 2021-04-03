package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class firefox {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium jars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		/*fdx.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        fdx.findElement(By.xpath("//input[@type='email']")).sendKeys("pranavwagh91@gmail.com");
        fdx.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb']")).click();;*/
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");

		Thread.sleep(2000);

		List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		for (WebElement option : AllOptions) {
			System.out.println(option.getText());
		}

	}
}