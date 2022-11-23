package addcart;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Search;
import testbase.Testbase;

public class Test1 extends Testbase{
	Search objs;
	
	
	
	public Test1()
	{
		super();
	}
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		objs=new Search();
	}
	
	@Test
	public void addcart()
	{
		String actualtitle=objs.pagetitle();
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		Assert.assertTrue(objs.tochecklogo());
		
		objs.searching();
	}
	
@AfterMethod
	
	public void teardown()
	{
		driver.close();
	}



	
}
