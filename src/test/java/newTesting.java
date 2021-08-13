import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class newTesting {
    public class newTestFile {
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
        }
    }
}
