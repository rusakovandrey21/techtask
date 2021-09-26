package org.appsmart.screens;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends Page {
    public void selectFirstShop() {
        $(By.xpath("//div[contains(@class,'BranchCard')]/button")).click();
    }
}
