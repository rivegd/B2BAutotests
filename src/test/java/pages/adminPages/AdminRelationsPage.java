package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminRelationsPage extends BasePage {
    public static final By CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[11]");
    public static final By RELATIONS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[17]");
    public static final By ADD_RELATIONS_BUTTON = By.xpath("//button[@class='btn btn-primary']");


    public AdminRelationsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_RELATIONS_BUTTON);
    }

    public AdminRelationsPage clickRelations() {
        driver.findElement(CLASSIFICATION_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(RELATIONS_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminRelationsPage(driver);
    }

}