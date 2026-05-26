package Tests;

import Tests.BaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import DOM.AboutRentPage;
import DOM.MainPage;
import DOM.WantPlaceOrder;
import DOM.WhoIsScooterForPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScooterOrderEndToEndTest extends BaseTest {

    @ParameterizedTest
    @CsvSource({
            "Вячеслав, Беляков, Москва, Черкизовская, 89998887766, 01.06.2026, тест",
            "Иван, Иванов, Казань, Сокольники, 89991112233, 05.06.2026, комментарий"
    })

    public void shouldCreateScooterOrder(
            String name,
            String surname,
            String address,
            String metro,
            String phone,
            String date,
            String comment
    ){

        MainPage mainPage = new MainPage(driver);

        mainPage.acceptCookies();

        mainPage.clickTopOrderButton();

        WhoIsScooterForPage whoIsScooterForPage = new WhoIsScooterForPage(driver);

        whoIsScooterForPage.enterName(name);
        whoIsScooterForPage.enterSurname(surname);
        whoIsScooterForPage.enterAddress(address);
        whoIsScooterForPage.enterMetro(metro);
        whoIsScooterForPage.enterPhone(phone);

        whoIsScooterForPage.clickNextButton();

        AboutRentPage aboutRentPage = new AboutRentPage(driver);

        aboutRentPage.enterDate(date);

        aboutRentPage.clickRentPeriod();
        aboutRentPage.chooseRentPeriod();

        aboutRentPage.clickBlackCheckbox();

        aboutRentPage.enterComment(comment);

        aboutRentPage.clickOrderButton();

        WantPlaceOrder wantPlaceOrderPage = new WantPlaceOrder(driver);

        wantPlaceOrderPage.clickYesButton();

        String actualText = wantPlaceOrderPage.getSuccessOrderText();

        assertTrue(actualText.contains("Заказ оформлен"));
    }
}