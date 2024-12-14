package hooks;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class GlobalHooks {

    public static WebDriver driver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        //Maximize browser screen
        driver.manage().window().maximize();
        //Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Open browser
        driver.get("https://www.tenq.ro/");
    }

    //@After
    public void tearDown(){
        driver.quit();
    }
}
