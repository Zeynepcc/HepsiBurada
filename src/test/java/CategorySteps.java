import BaseConfig.BaseConfigPage;
import Packets.CategoryPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.*;
import java.util.Properties;

public class CategorySteps extends BaseConfigPage {

    static Properties prop;

    @Step("A random category is hovered over and the category is selected")
    public void  SelectCategory()
    {
        new CategoryPage(getDriver()).SelectCategory();
    }
    @Step("The trademark on the left is selected")
    public void SelectTradeMark()
    {
        new CategoryPage(getDriver()).SelectTradeMark();
    }
    @Step("The price range is between <min> and <max>")
    public void priceRange(String min , String max)
    {
        new CategoryPage(getDriver()).PriceRange(min,max);
    }

    @Step("A random product is chosen")
    public void RandomProductSelect() throws IOException {
        new CategoryPage(getDriver()).RandomSelectProduct();
    }
    @Step("The price is compared and checked.")
    public void ComprasionProducts() throws IOException {
        String price = new CategoryPage(getDriver()).ComparisonProducts();
        prop = new Properties();
        FileInputStream ip = new FileInputStream("Settings/Data");
        prop.load(ip);
        String pricemain = prop.getProperty("ProductName");
        Assert.assertEquals(price,pricemain.substring(0,pricemain.length()-3));
    }
    @Step("Add To Card")
    public void AddToCard()
    {
        new CategoryPage(getDriver()).AddToCard();
    }
    @Step("Product Numbers are checked.")
    public void ProductNumberEqual()
    {
        String number = new CategoryPage(getDriver()).ProductNumberEqual();
        Assert.assertEquals(number,getDriver().findElement(By.id("cartItemCount")).getText());
    }

}
