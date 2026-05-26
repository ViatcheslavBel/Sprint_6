package DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHasBeenPlaced {
    private WebDriver driver;

    //Текст "Заказ оформлен".
    private By orderHasBeenPlacedText = By.className("Order_ModalHeader__3FDaJ");

    public OrderHasBeenPlaced(WebDriver driver){
        this.driver=driver;
    }
}
