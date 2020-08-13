import BaseConfig.BaseConfigPage;
import Packets.HomePage;
import SampleFunction.SampleFunctionPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;

public class HomeSteps extends BaseConfigPage {

    @Step("Open WebSite")
    public void OpenPage()
    {
        new HomePage(getDriver());
    }
}
