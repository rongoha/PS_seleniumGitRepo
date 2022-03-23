import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		String userPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",userPath + "/drivers/chromedriver");
		driver.manage().window().maximize();
		driver.get("https://www.n12.co.il/");
		
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/nav/ul/li[1]/ul/li[7]/a")));
		driver.findElement(By.xpath("/html/body/nav/ul/li[1]/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
