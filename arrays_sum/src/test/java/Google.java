
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\robin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		// Define the XPaths for the web elements to be verified
		String logoXPath = "//img[@class='lnXdpd']";
	    String searchBoxXPath = "//textarea[@name='q']";
	    String searchButtonXPath = "(//input[@name='btnK'])[2]";
	    String luckyButtonXPath = "(//input[@name='btnI'])[2]";
        
     // Find the web elements by their XPaths
        WebElement logo = driver.findElement(By.xpath(logoXPath));
        WebElement searchBox = driver.findElement(By.xpath(searchBoxXPath));
        WebElement searchButton = driver.findElement(By.xpath(searchButtonXPath));
        WebElement luckyButton = driver.findElement(By.xpath(luckyButtonXPath));

        // Verify that the web elements are present and visible
        if (logo.isDisplayed()) {
            System.out.println("Google logo is present");
        } else {
            System.out.println("Google logo is not present");
        }

        if (searchBox.isDisplayed()) {
            System.out.println("Search text box is present");
        } else {
            System.out.println("Search text box is not present");
        }

        if (searchButton.isDisplayed()) {
            System.out.println("Google Search button is present");
        } else {
            System.out.println("Google Search button is not present");
        }

        if (luckyButton.isDisplayed()) {
            System.out.println("I'm Feeling Lucky button is present");
        } else {
            System.out.println("I'm Feeling Lucky button is not present");
        }

        // Close the browser window
        driver.quit();

	}

}
