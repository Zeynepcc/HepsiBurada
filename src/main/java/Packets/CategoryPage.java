package Packets;


import SampleFunction.SampleFunctionPage;
import okio.Utf8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Random;


public class CategoryPage extends SampleFunctionPage {


    static Properties prop;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }
    public void SelectCategory()
    {
        hoverElement(By.cssSelector(" div.MenuItems-2xUK7 > div > ul > li:nth-child(1)"));
    }
    public void SelectTradeMark()
    {
        clickElement(By.cssSelector("#navigationDesktop_183  div:nth-child(1) > ul > li > a"));
    }
    public void PriceRange(String min ,String max)
    {
        sendKeysValue(By.cssSelector("li.box-container.fiyat  div:nth-child(1) > input"),min);
        sendKeysValue(By.cssSelector(" li.box-container.fiyat  div:nth-child(3) > input"),max);
        clickElement(By.cssSelector("li.box-container.fiyat  div.range-contain-row.right > button"));
    }
    public void RandomSelectProduct() throws IOException {

        try(OutputStream output = new FileOutputStream("Settings/Data"))
        {
            prop = new Properties();
            String productprice= findElement(By.cssSelector("li:nth-child(3) > div div.last-price.hb-pl-cn > div.price-value")).getText();
            prop.setProperty("ProductName", productprice);
            prop.store(output, null);

            //Utf-8 yapmama rağmen hala türkçe karakterleri derlemede göstermiyor.O yüzden ürün adını almadım
        }
        catch (IOException io)
        {
            io.printStackTrace();
        }

    }
    public String ComparisonProducts()
    {
        clickElement(By.cssSelector("ul > li:nth-child(3) > div > a"));
        return findElement(By.cssSelector("div.extra-discount-price > span")).getText();
    }
    public void AddToCard()
    {
        clickElement(By.id("addToCart"));
        clickElement(By.cssSelector(".SalesFrontCash-3zIbr"));
    }
    public String ProductNumberEqual()
    {
        return  findElement(By.id("quantity")).getAttribute("value");
    }

}
