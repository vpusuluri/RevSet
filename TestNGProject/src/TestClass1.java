import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass1 
{

	protected static WebDriver wd;
	protected static String result;

	@BeforeClass
	public static void setup() 
	{
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	void Testcase1() 
	{
		wd.get("http://www.floraindia.com");
		wd.findElement(By.id("kwsch")).sendKeys("Red");
		wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();
		result = wd.findElement(
				By.xpath("//font[text()='Total Items :']//following:: td[1]"))
				.getText();
		Assert.assertEquals(result, "119");
	}

	@Test(enabled = false)
	void Testcase2() 
	{
		wd.get("http://www.floraindia.com");
		wd.findElement(By.id("kwsch")).sendKeys("Blue");
		wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();
		result = wd.findElement(
				By.xpath("//font[text()='Total Items  :']//following::td[1]"))
				.getText();
		Assert.assertEquals(result, "13");
	}

	@Test(enabled = false)
	void Testcase3() 
	{
		wd.get("http://www.floraindia.com");
		wd.findElement(By.id("kwsch")).sendKeys("Yellow");
		wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();
		result = wd.findElement(
				By.xpath("//font[text()='Total Items  :']//following::td[1]"))
				.getText();
		Assert.assertEquals(result, "27");
	}

	@Test(enabled = false)
	void Testcase4() 
	{
		wd.get("http://www.floraindia.com");
		wd.findElement(By.id("kwsch")).sendKeys("Purple");
		wd.findElement(By.xpath("//input[@src='images/go.gif']")).click();
		result = wd.findElement(
				By.xpath("//font[text()='Total Items  :']//following::td[1]"))
				.getText();
		Assert.assertEquals(result, "10");
	}

	@AfterClass
	public static void teardown() 
	{
		wd.close();
		wd.quit();
	}

}
