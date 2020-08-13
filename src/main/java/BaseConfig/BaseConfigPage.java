package BaseConfig;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSuite;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfigPage {

    static private WebDriver driver;
    static Properties prop;

    @BeforeSuite
    public void Prepare()
    {
        ChangeBrowser();
        String browser = prop.getProperty("browser");
        if(browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "Settings\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "Settings\\Driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equals("explorer"))
        {
            //
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    /*@AfterSuite
    public void Finish()
    {
        driver.quit();
    }*/

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void ChangeBrowser()
    {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("Settings/ChooseDriver");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
