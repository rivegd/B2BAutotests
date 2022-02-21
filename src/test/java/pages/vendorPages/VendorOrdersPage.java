package pages.vendorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class VendorOrdersPage extends BasePage {
    public static final By PREORDERS_AND_ORDERS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//div[@class='nav-link__text'])[6]");
    public static final By ORDERS_VENDOR_SIDE_MENU_BUTTON = By.xpath("(//li//span[@class='position-relative'])[7]");
    public static final By ORDERS_SHOW_BY = By.xpath("//ul[@class='d-flex']");

    public VendorOrdersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(ORDERS_SHOW_BY);
    }

    public VendorOrdersPage clickOrders() {
        driver.findElement(PREORDERS_AND_ORDERS_VENDOR_SIDE_MENU_BUTTON).click();
        driver.findElement(ORDERS_VENDOR_SIDE_MENU_BUTTON).click();
        return new VendorOrdersPage(driver);
    }

}