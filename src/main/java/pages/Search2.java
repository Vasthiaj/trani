package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class Search2 extends Testbase {
	
	
	@FindBy(css="img[src='https://m.media-amazon.com/images/I/41-r13-MCIL._AC_UL320_.jpg']")WebElement select;
	
	
	 public Search2()
	{
		PageFactory.initElements(driver, this);
	}
	 
	 public void searching2() throws InterruptedException
	 {
		 Actions act=new Actions(driver);
		 act.sendKeys(Keys.PAGE_DOWN).build().perform();
		 act.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(4000);
		 select.click();

	 }

}
