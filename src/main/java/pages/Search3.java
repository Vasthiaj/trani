package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.Testbase;

public class Search3 extends Testbase{
	
	@FindBy(css="img[src='https://m.media-amazon.com/images/I/41zv6e5D90L._SX38_SY50_CR,0,0,38,50_.jpg']")WebElement colour;

	@FindBy(css="input#add-to-cart-button")WebElement cart;
	
	public Search3()
	{
		PageFactory.initElements(driver, this);
	}

	public void searching3() throws InterruptedException
	{
		Set<String>wid=driver.getWindowHandles();
		ArrayList<String>mwin=new ArrayList<String>(wid);
		driver.switchTo().window(mwin.get(1));
		
		WebElement size=driver.findElement(By.cssSelector("select.a-native-dropdown"));
		Select sdrdw=new Select(size);
		Thread.sleep(4000);
		sdrdw.selectByIndex(3);
		
		
		colour.click();
		Thread.sleep(4000);
		
		cart.click();
	}


}
