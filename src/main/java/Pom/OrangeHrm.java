

package Pom;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class OrangeHrm 
{
	static WebDriver driver;
	
	@BeforeTest
	public void initialiseBrowser()
	{
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions o=new ChromeOptions();
     //	o.addArguments("--remote-allow-origins=*"); 
     	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.manage().window().maximize();		
	}
	@AfterTest
	public void Teardown()
	{driver.quit();}
	
	@Test
	public void LaunchApp() throws Exception
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void EnterLoginDetails() throws Exception
	{
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	@Test
	public void NavigateToMyinfo() throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
	}
	@Test
	public void VerifyMyinfo()
	{
		System.out.println(driver.findElement(By.xpath("//a[text()='Personal Details']")).isDisplayed());
		
		
	}
	@Test
	public void VerifyLogin()
	{
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.getText());
		
	}
}
 
