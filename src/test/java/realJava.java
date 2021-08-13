import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//where is my job!!!

public class realJava {
    WebDriver driver;

    ///1
    @AfterTest
    public void tearDown() {

        driver.close();
        //closes all test windows
        driver.quit();
        //closes currently tested window

    }

    //2
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/driver1/chromedriverplus.exe");
        driver = new ChromeDriver();


    }

    //3
    @Test
    public void verifyOne() {
        String url = "https://insurancewebsitedemo.com/";
        driver.get(url);
        String expectedTitle = "Auto, Home, Car, Business, Life & Health Insurance in Las Vegas Nevada - Demo Insurance Agency";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement notif = driver.findElement(By.id("notice-close"));
        notif.click();


        WebElement quoteRequestLink = driver.findElement(By.linkText("Life"));
        quoteRequestLink.click();
    }
}



