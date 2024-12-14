package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[3]/header[2]/div/div[2]/div/ul/li[1]/a")
    WebElement contulMeuButton;

    @FindBy(id = "customer_email")
    WebElement usernameInput;

    @FindBy(id = "customer_password")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/input[5]")
    WebElement clickIntraInCont;

    public void clickContulMeu() {
        contulMeuButton.click();
    }

    public void inputUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickIntraInContButton () {
        clickIntraInCont.click();
    }

}
