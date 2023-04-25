package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class Base_class 
{
	
	public void f()
	{
		ChromeOptions o=new ChromeOptions();
	 	o.addArguments("--remote-allow-origins=*");
	 	 WebDriver d = new ChromeDriver(o);
	 	 d.get("https://demo.actitime.com/login.do");
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void l(WebDriver driver)
	{
		A_login a=new A_login(driver);
		 a.login("admin", "manager");
	}
}
	

