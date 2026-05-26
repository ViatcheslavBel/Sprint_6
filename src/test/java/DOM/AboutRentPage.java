package DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AboutRentPage {
    private WebDriver webDriver;

    public AboutRentPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    //Поле "Когда привезти самокат".
    private By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //Поле "Срок Аренды"
    private By rentPeriodField = By.className("Dropdown-control");

    // Выпадающий список срока аренды
    private By rentPeriodOption = By.xpath(".//div[@class='Dropdown-option']");

    //Чек-бокс "Черный жемчуг"
    private By blackColorCheckbox = By.id("black");

    //Чек-бокс "Серая безысходность"
    private By greyColorCheckbox = By.id("grey");

    // Комментарий курьеру
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    // Кнопка "Заказать"
    private By orderButton = By.xpath("(//button[text()='Заказать'])[2]");

    public void enterDate(String date){
        webDriver.findElement(dateField).sendKeys(date);
    }

    public void clickRentPeriod(){
        webDriver.findElement(dateField).sendKeys(Keys.ESCAPE);
        webDriver.findElement(rentPeriodField).click();
    }

    public void chooseRentPeriod(){
        webDriver.findElement(rentPeriodOption).click();
    }

    public void clickBlackCheckbox(){
        webDriver.findElement(blackColorCheckbox).click();
    }

    public void clickGreyCheckbox(){
        webDriver.findElement(greyColorCheckbox).click();
    }

    public void enterComment(String comment){
        webDriver.findElement(commentField).sendKeys(comment);
    }

    public void clickOrderButton(){
        webDriver.findElement(orderButton).click();
    }
}
