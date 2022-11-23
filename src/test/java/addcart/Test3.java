package addcart;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Search;
import pages.Search2;
import pages.Search3;
import testbase.Testbase;

public class Test3 extends Testbase{
	
	Search objs;
	Search2 objs2;
	Search3 objs3;
	
	public Test3()
	{
		super();
	}
	
@BeforeMethod
	
	public void setup()
	{
		initialization();
		objs=new Search();
		objs2=new Search2();
		objs3=new Search3();
				
	}


@Test
public void addcart3() throws InterruptedException
{
	
	
	objs.searching();
	objs2.searching2();
	objs3.searching3();
		
}

@AfterMethod

public void teardown()
{
	driver.close();
}
	


}
