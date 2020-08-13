import BaseConfig.BaseConfigPage;
import Packets.CardInfoPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CardInfoSteps extends BaseConfigPage {

    @Step("Address is added")
    public void AdressAdd()
    {
        new CardInfoPage(getDriver()).CustomerInfo("Zeynep","Turhan","17 eylül","Ev"," 5422800925");
    }
    @Step("Continue")
    public void Continue()
    {
        new CardInfoPage(getDriver()).Continue();
    }
    @Step("Choose Credit Card")
    public void ChooseType()
    {
        new CardInfoPage(getDriver()).ChooseType();
    }
    @Step("Entered Credit Info")
    public void EnterCredit()
    {
        new CardInfoPage(getDriver()).CreditInfo();
    }
    @Step("Cleaned Basket")
    public void CleanBasket()
    {
        new CardInfoPage(getDriver()).CleanBasket();
    }
    @Step("Deleted Addresses")
    public void DeletedAddresses()
    {
        new CardInfoPage(getDriver()).DeletedAdress();
    }
    @Step("Close WebSite")
    public void CloseBrowser()
    {
        new CardInfoPage(getDriver()).CloseBrowser();
    }

}
