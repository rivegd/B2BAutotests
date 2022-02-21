package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AdminUsersPage extends BasePage {
    public static final By USERS_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[12]");
    public static final By USER_ADMIN_SIDE_MENU_BUTTON = By.xpath("(//span[@class='position-relative'])[20]");
    public static final By CREATE_USER_BUTTON = By.xpath("//div[@class='icon-tool_text fa fa-add']");

    public AdminUsersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(CREATE_USER_BUTTON);
    }

    public AdminUsersPage clickUsers() {
        driver.findElement(USERS_ADMIN_SIDE_MENU_BUTTON).click();
        driver.findElement(USER_ADMIN_SIDE_MENU_BUTTON).click();
        return new AdminUsersPage(driver);
    }

}