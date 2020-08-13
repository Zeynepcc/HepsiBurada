package Packets;

import SampleFunction.SampleFunctionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class BasketPage extends SampleFunctionPage {

    static Properties prop;

    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public String AddTwoProducts() throws InterruptedException {
        clickElement(By.cssSelector("div.OldMyAccount-1BFaN > a"));
        clickElement(By.cssSelector("div > button.increase"));
        Thread.sleep(3000);
        clickElement(By.cssSelector("div > button.increase"));
        Thread.sleep(3000);
        return findElement(By.cssSelector(" div:nth-child(1) > p > span")).getText();
    }
    public void ComplateShop()
    {
        try(OutputStream output = new FileOutputStream("Settings/PriceData"))
        {
            prop = new Properties();
            String productprice= findElement(By.cssSelector("div.total-amount > div > span")).getText();
            prop.setProperty("Price", productprice);
            prop.store(output, null);

        }
        catch (IOException io)
        {
            io.printStackTrace();
        }
        clickElement(By.cssSelector(" div.cart-proceed-container > button"));
    }
}
