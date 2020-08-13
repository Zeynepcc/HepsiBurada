import BaseConfig.BaseConfigPage;
import Packets.BasketPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketPageSteps extends BaseConfigPage {

    @Step("The number is increased by 2.")
    public void AddTwoProducts() throws InterruptedException {
       String number = new BasketPage(getDriver()).AddTwoProducts();
       Assert.assertEquals(number , "3 ürün");
    }
    @Step("Complete the shopping is clicked.")
    public void ComplateShop()
    {
        new BasketPage(getDriver()).ComplateShop();
    }

}
