package DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WantPlaceOrder {
    private WebDriver webDriver;

    public WantPlaceOrder(WebDriver webDriver){
        this.webDriver=webDriver;
    }


    //Кнопка "Да".
    private By yesButton = By.xpath("//button[text()='Да']");

    // Текст успешного заказа
    private By successOrderText = By.xpath(".//div[contains(text(),'Заказ оформлен')]");

    public void clickYesButton(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(yesButton)).click();
    }

    public String getSuccessOrderText(){
        return webDriver.findElement(successOrderText).getText();
    }
}
