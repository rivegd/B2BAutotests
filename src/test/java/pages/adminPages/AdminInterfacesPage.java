package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminInterfacesPage extends BasePage {
    public static final By LOCALIZATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[13]");
    public static final By INTERFACES_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[25]");
    public static final By INTERFACES_SEARCH_INPUT = By.xpath("//input[@type='text']");

    public AdminInterfacesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(INTERFACES_SEARCH_INPUT);
    }

    public AdminInterfacesPage clickInterfaces() {
        driver.findElement(LOCALIZATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(INTERFACES_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminInterfacesPage(driver);
    }


}