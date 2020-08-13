package Packets;

import BaseConfig.BaseConfigPage;
import SampleFunction.SampleFunctionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends SampleFunctionPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void ClickLoginButton() throws InterruptedException {

        hoverElement(By.id("myAccount"));
        clickElement(By.id("login"));
    }
    public void EnterUsersname(String username)
    {
        sendKeysValue(By.id("txtUserName"),username);
    }
    public void EnterPass(String pass)
    {
        sendKeysValue(By.id("txtPassword"),pass);
    }
    public void ClickEntryButton()
    {
        clickElement(By.id("btnLogin"));
    }
    public String LoginControl()
    {
        return  findElement(By.cssSelector("a > span.OldMyAccount-2BwAt")).getText();
    }
    public String BasketControl()
    {
        return findElement(By.id("cartItemCount")).getText();
    }
}
