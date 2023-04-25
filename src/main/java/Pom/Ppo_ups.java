package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(Pom.ListnerImplementationClass.class)
public class Ppo_ups 
{
	static WebDriver driver;
	@Test
	public void demo() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipsesahoo\\chromedriver.exe");

		driver = new ChromeDriver();
		SoftAssert s = new SoftAssert();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,400)");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Alerts, Frame & Windows']//span")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Alerts, Frame & Windows']//span")).click();
		j.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//span[normalize-space()='Alerts']")).click();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("Suryakanta Sahoo");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"promptResult\"]")).getText());
		s.assertAll();
		driver.quit();
	}
}
