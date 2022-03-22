import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		String userPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",userPath + "/drivers/chromedriver");
		driver.get("https://www.n12.co.il/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/nav/ul/li[1]/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
