package org.appsmart.screens;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.Assert.assertTrue;

public class StorePage extends Page {
    // TODO separate in sections
    public void switchToCategoryLasagne() {
        $(By.xpath("//span[contains(text(),'Lasagne')]")).click();
    }

    public void addFirstProduct() {
        $(By.xpath("//div[@class='product-standard-button-text']")).click();
    }

    public void confirmCart() {
        $(By.xpath("//button[@qa-data='basket-order-btn']")).click();
    }

    public void fillPersonalInfoWithTestData() {
        $("#first_name").setValue("test");
        $("#last_name").setValue("test");
        $("#company").setValue("test");
        $("#street").setValue("test");
        $("#street_no").setValue("test");
        $("#zip").setValue("443110");
        $("#city").setValue("test");
        $("#email").setValue("rusakovandrey21@gmail.com");
        $("#phone").setValue("1");
        $("#message").setValue("test");
    }

    public void selectPaymentOptionCash() {
        $$(By.xpath("//input[@type='radio']")).get(0).click();
    }

    public void confirmPurchase() {
        $(By.xpath("//button[@class='button-order positive-action']")).click();
    }

    public void checkOrderSuccessIsDisplayed() {
        $(".order-success").shouldBe(visible);
        assertTrue($(".order-success").isDisplayed());
    }
}
