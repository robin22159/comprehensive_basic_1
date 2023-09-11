package arrays_sum;

// Import the required packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

    // Declare a WebDriver variable
    WebDriver driver;

    // Define the URL to be tested
    String url = "https://www.google.com";
    
 // Set up the test before execution
    @BeforeTest
    public void setUp() {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\robin\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    // Define the XPaths for the web elements to be verified
    String logoXPath = "//img[@class='lnXdpd']";
    String searchBoxXPath = "//textarea[@name='q']";
    String searchButtonXPath = "(//input[@name='btnK'])[2]";
    String luckyButtonXPath = "(//input[@name='btnI'])[2]";


    // Test the web elements using assertions
    @Test
    public void testGoogleElements() {
        // Find the web elements by their XPaths
        WebElement logo = driver.findElement(By.xpath(logoXPath));
        WebElement searchBox = driver.findElement(By.xpath(searchBoxXPath));
        WebElement searchButton = driver.findElement(By.xpath(searchButtonXPath));
        WebElement luckyButton = driver.findElement(By.xpath(luckyButtonXPath));

        // Assert that the web elements are present and visible
        Assert.assertTrue(logo.isDisplayed(), "Google logo is not present");
        Assert.assertTrue(searchBox.isDisplayed(), "Search text box is not present");
        Assert.assertTrue(searchButton.isDisplayed(), "Google Search button is not present");
        Assert.assertTrue(luckyButton.isDisplayed(), "I'm Feeling Lucky button is not present");
    }

    // Tear down the test after execution
    @AfterTest
    public void tearDown() {
        // Close the browser window
        driver.quit();
    }
}

