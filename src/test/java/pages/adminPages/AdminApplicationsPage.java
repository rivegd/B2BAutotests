package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminApplicationsPage extends BasePage {
    public static final By APPLICATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[1]");
    public static final By REGISTRATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[1]");
    public static final By SEARCH_BY_INPUT = By.xpath("//input[@type='text']");

    public AdminApplicationsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SEARCH_BY_INPUT);
    }

    public AdminApplicationsPage clickApplicationsRegistration() {
        driver.findElement(APPLICATION_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(REGISTRATION_ADMIN_SIDE_MENU_BUTTON));
        driver.findElement(REGISTRATION_ADMIN_SIDE_MENU_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_BY_INPUT));
        return new AdminApplicationsPage(driver);
    }

}
