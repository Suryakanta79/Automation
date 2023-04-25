package com.hyr.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Pom.A_login;
@Test
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
		 A_login a=new A_login(d);
		 a.login("admin", "manager");
	}
	
}
