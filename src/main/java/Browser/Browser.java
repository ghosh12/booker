package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Homepage;

import java.util.concurrent.TimeUnit;

/**
 * Created by dipak on 9/26/2018.
 */
public class Browser {
    public static WebDriver driver = null;

    public static Homepage openbrWoser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dipak\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.booker.com/");
        return PageFactory.initElements(driver, Homepage.class);

    }

}