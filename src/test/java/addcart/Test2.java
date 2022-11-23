package addcart;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Search;
import pages.Search2;
import testbase.Testbase;

public class Test2 extends Testbase{
	
	Search objs;
	Search2 objs2;
	
	public Test2()
	{
		super();
	}
	
@BeforeMethod
	
	public void setup()
	{
		initialization();
		objs=new Search();
		objs2=new Search2();
	}

@Test
public void addcart2() throws InterruptedException
{
	
	
	objs.searching();
	objs2.searching2();
	
	
}


@AfterMethod

public void teardown()
{
	driver.close();
}

}
