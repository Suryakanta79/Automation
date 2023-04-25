package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_login
{
	@FindBy(xpath="//input[@id='username']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password; 
	
	@FindBy(xpath="//div[normalize-space()='Login']")
	private WebElement btn;
	
	public A_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtn() {
		return btn;
	}
	public void login(String Name,String Password)
	{
		Username.sendKeys(Name);
		password.sendKeys(Password);
		btn.click();
	}
	

}
