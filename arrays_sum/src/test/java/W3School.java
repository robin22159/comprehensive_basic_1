
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W3School {

    // Declare the driver as a class variable

    // Set up the test before execution
    public static void main(String[] args) {
//    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\robin\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

        // Define the XPaths for the web elements to be interacted with
        String searchBoxXPath = "//textarea[@name='q']";
        String searchButtonXPath = "(//input[@name='btnK'])[2]";
        String firstLinkXPath = "//div[@id='search']//div[@class='g'][1]//a";

        // Define the expected URL for W3Schools
        String expectedUrl = "https://www.w3schools.com/";

        // Find the search box by its XPath and enter "W3Schools"
        WebElement searchBox = driver.findElement(By.xpath(searchBoxXPath));
        searchBox.sendKeys("W3Schools");

        // Find the search button by its XPath and click it
        WebElement searchButton = driver.findElement(By.xpath(searchButtonXPath));
        searchButton.click();

        // Find the first link by its XPath and click it
        WebElement firstLink = driver.findElement(By.xpath(firstLinkXPath));
        firstLink.click();

        // Get the current URL of the browser
        String currentUrl = driver.getCurrentUrl();

        // Verify that the current URL matches the expected URL for W3Schools
        if (currentUrl.equals(expectedUrl)) {
            System.out.println("The browser navigated to the W3Schools url");
        } else {
            System.out.println("The browser did not navigate to the W3Schools url");
            System.out.println("Expected: " + expectedUrl);
            System.out.println("Actual: " + currentUrl);
        }

        driver.quit();
    }

  
 }
