package org.appsmart.tests.ui;

import com.codeborne.selenide.junit.TextReport;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.appsmart.screens.StorePage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.appsmart.screens.HomePage;

import static com.codeborne.selenide.Selenide.open;


public class PurchaseTest {

    // TODO: implement dependency injection to remove ugly initializations

    @Rule
    public TextReport report = new TextReport();

    @Before
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @Test()
    public void purchaseWithCash() {
        open("https://hermes-dev.devteam.win/-bremen-2/");
        new HomePage().selectFirstShop();

        StorePage storePage = new StorePage();
        storePage.switchToCategoryLasagne();
        storePage.addFirstProduct();
        storePage.confirmCart();
        storePage.fillPersonalInfoWithTestData();
        storePage.confirmCart();
        storePage.selectPaymentOptionCash();
        storePage.confirmPurchase();
        storePage.checkOrderSuccessIsDisplayed();
    }
}
