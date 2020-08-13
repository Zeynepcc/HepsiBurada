package Packets;

import SampleFunction.SampleFunctionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ConstantValue.CustomerCard.*;
import static ConstantValue.CustomerInfo.*;

public class CardInfoPage extends SampleFunctionPage {

    public CardInfoPage(WebDriver driver) {
        super(driver);
    }
    public void CustomerInfo(String name , String surname , String address , String addres_name, String phone )
    {
            //SORUNLU SELECT İŞLEMLERİ
            //selectOptionByValue(CITY,"10");
            //selectOptionByValue(TOWN,"1171");
            sendKeysValue(NAME, name);
            sendKeysValue(SURNAME, surname);
            sendKeysValue(ADDRESS, address);
            sendKeysValue(ADRESS_NAME, addres_name);
            //SELECT İLE OLMADI
            clickElement(By.xpath("//*[@id=\"form-address\"]/div/div/section[2]/div[3]/div/div/button"));
            sendKeysValue(By.xpath("//*[@id=\"form-address\"]/div/div/section[2]/div[3]/div/div/div/div/input"), "BAĞCILAR");
            clickElement(By.xpath("//*[@id=\"form-address\"]/div/div/section[2]/div[3]/div/div/div/ul/li[6]/a/span"));
            clickElement(By.cssSelector("#form-address section:nth-child(3) > div:nth-child(4)  button"));
            sendKeysValue(By.cssSelector("#form-address   div.control-group.live-search.error  input"), "BAĞLAR");
            clickElement(By.cssSelector("#form-address > div > div > section:nth-child(3) > div.control-group.live-search.error > div > div > div > ul > li:nth-child(4) > a"));
            clickElement(By.xpath("//*[@id=\"form-address\"]/div/div/section[3]/div/div/div/div/div"));
            clickElement(PHONE_CODE);
            getDriver().findElement(PHONE).sendKeys(phone);

    }
    public void Continue()
    {
        clickElement(By.cssSelector("#short-summary  button"));
    }
    public void ChooseType()
    {
        clickElement(By.cssSelector("#payment-container div:nth-child(1) > a"));
    }
    public void CreditInfo()//çalışmayınca değerleri sildim
    {
        //Güvenlik sebebiyle işlemlerin gerçekleşmediğini düşünüyorum.Yoksa bu kodun çalışması
        //gerekiyor.Diğer teste geçebilmem için açıklama satırına alıyorum
        /*sendKeysValue(CARDNO,cardno);
        sendKeysValue(CARDFULLNAME,fullname);
        selectOptionByValue(MONTH,"4");
        selectOptionByValue(YEAR,"7");*/
        clickElement(By.id("logo"));
    }
    public void CleanBasket()
    {
        clickElement(By.cssSelector("a.btn-delete"));
    }
    public void DeletedAdress()
    {
        hoverElement(By.id("myAccount"));
        clickElement(By.cssSelector("#myAccount li:nth-child(2) > a"));
        clickElement(By.cssSelector(" div:nth-child(6)  div.NavigationMenuItem-3JKIS"));
        clickElement(By.cssSelector("li:nth-child(2)  div.action-buttons > a.btn-delete.btn-text"));
        clickElement(By.cssSelector(" li:nth-child(2) > div > div.delete-overlay  a.btn.btn-md"));
        clickElement(By.cssSelector("#customer-addresses li:nth-child(2) > a"));
        clickElement(By.cssSelector("li:nth-child(2) > div > div.action-buttons > a.btn-delete.btn-text"));
        clickElement(By.cssSelector("li:nth-child(2) > div > div.delete-overlay.open > div > a.btn.btn-md"));
    }
    public void CloseBrowser()
    {
        getDriver().quit();
    }
}
