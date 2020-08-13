package Packets;

import BaseConfig.BaseConfigPage;
import SampleFunction.SampleFunctionPage;
import org.openqa.selenium.WebDriver;

import static ConstantValue.WebSiteLink.websiteLink;

public class HomePage extends SampleFunctionPage {


    public HomePage(WebDriver driver)
    {
        super(driver);
        getDriver().get("https://www.hepsiburada.com/");
    }
}
