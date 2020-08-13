import BaseConfig.BaseConfigPage;
import Packets.HomePage;
import Packets.LoginPage;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.soap.Text;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class LoginSteps extends BaseConfigPage {

    @Step("Login button is clicked")
    public void ClickButton() throws InterruptedException {
        new HomePage(getDriver()).callLoginPage().ClickLoginButton();
    }
    @Step("<username> Username is entered")
    public void EnterUsername(String username)
    {
       new LoginPage(getDriver()).callLoginPage().EnterUsersname(username);
    }
    @Step("<password> Password is entered")
    public void EnteredPassName(String password)
    {
        new LoginPage(getDriver()).callLoginPage().EnterPass(password);
    }
    @Step("Entry Button is clicked")
    public void EntryClick()
    {
        new LoginPage(getDriver()).ClickEntryButton();
    }
    @Step("Login Control is done")
    public void LoginControl()
    {
        String value_note = new LoginPage(getDriver()).callLoginPage().LoginControl();
        Assert.assertEquals(value_note,"Hesabım");
    }
    @Step("Basket check done")
    public void BasketControl()
    {
       String number =  new HomePage(getDriver()).callLoginPage().BasketControl();
       Assert.assertEquals(number , "0");
    }






}
