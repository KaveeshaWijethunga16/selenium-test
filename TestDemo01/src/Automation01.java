import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty(" webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		

		ChromeDriver driver =  new ChromeDriver();
		//FirefoxDriver driver =  new FirefoxDriver();
		//EdgeDriver driver =  new EdgeDriver();
		
		driver.get("http://www.ebay.com");
		
		//testing
	}

}
