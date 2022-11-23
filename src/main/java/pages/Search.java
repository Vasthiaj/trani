package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class Search extends Testbase {
	
	@FindBy(css="a#nav-logo-sprites")WebElement logo;
	@FindBy(css="input#twotabsearchtextbox")WebElement search;
	@FindBy(css="input#nav-search-submit-button")WebElement enter;
	

	public Search()
	{
		
		PageFactory.initElements(driver, this);
	}
	public String pagetitle()
	{
		return driver.getTitle();
		
	}
	public boolean tochecklogo()
	{
		return logo.isDisplayed();
		
	}
	public void searching()
	{
		search.sendKeys("mens tshirt");
		enter.click();
	}

	
	}