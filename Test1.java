package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
@Test
public void DemoTest()
{
	Assert.assertTrue(true);
	Assert.assertEquals("welcome","welcome");
	Assert.assertEquals("Selenium", "Selenium");
	System.out.println("successfully passed");
}

}
