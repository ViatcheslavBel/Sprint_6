package DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
   private WebDriver webDriver;

    public MainPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }
    //Кнопка "Да все привыкли".
    private By cookieButton = By.xpath(".//button[text()='да все привыкли']");

    //Кнопка "Заказать" вверху страницы.
    private By buttonOrderTopPage = By.xpath("(//button[text()='Заказать'])[2]");

    //Кнопка "Заказать" внизу страницы.
    private By buttonOrderButtonPage = By.xpath("(//button[text()='Заказать'])[1]");

    // Нажать верхнюю кнопку заказа
    public void clickTopOrderButton(){
        webDriver.findElement(buttonOrderTopPage).click();
    }

    // Нажать нижнюю кнопку заказа
    public void clickBottomOrderButton(){
        webDriver.findElement(buttonOrderButtonPage).click();
    }

   //Выпадающий список в разделе "Вопросы о важном".
   private By getQuestion(int index){
       return By.id("accordion__heading-" + index);
   }

   private By getAnswer(int index){
       return By.id("accordion__panel-" + index);
   }

    // Нажать вопрос
    public void clickQuestion(int index){
        webDriver.findElement(getQuestion(index)).click();
    }

    // Получить текст ответа
    public String getAnswerText(int index){
        return webDriver.findElement(getAnswer(index)).getText();
    }

    public void acceptCookies() {
        webDriver.findElement(cookieButton).click();
    }
}
