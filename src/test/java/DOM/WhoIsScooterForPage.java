package DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhoIsScooterForPage {
    private WebDriver webDriver;

    public WhoIsScooterForPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }



    //Поле "Имя".
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");

    //Поле "Фамилия".
    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");

    //Поле "Адрес".
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //Поле "Станция метро".
    private By metroField = By.xpath("//input[contains(@class,'select-search__input')]");


    //Поле "Номер телефона".
    private By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //Кнопка "Далее".
    private By nextButton = By.xpath(".//button[text()='Далее']");

    // Выбрать станцию метро
    private By metroOption(String metro) {
        return By.xpath("//*[contains(text(), '" + metro + "')]");
    }

    public void enterName(String name){
        webDriver.findElement(nameField).sendKeys(name);
    }

    public void enterSurname(String surname){
        webDriver.findElement(surnameField).sendKeys(surname);
    }

    public void enterAddress(String address){
        webDriver.findElement(addressField).sendKeys(address);
    }

    public void enterMetro(String metro){
        webDriver.findElement(metroField).click();
        webDriver.findElement(metroField).sendKeys(metro);
        webDriver.findElement(metroOption(metro)).click();
    }

    public void enterPhone(String phone){
        webDriver.findElement(phoneField).sendKeys(phone);
    }

    public void clickNextButton(){
        webDriver.findElement(nextButton).click();
    }
}

