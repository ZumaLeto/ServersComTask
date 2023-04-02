package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BasePage {
    Page page;
    Locator profileSvg;
    Locator logInBtn;
    Locator writePublicationBtn;
    Locator userProfileSvg;
    Locator settingProfileBtn;
    Locator exitBtn;
    Locator allStreamBtn;

    public BasePage(Page page) {
        this.page = page;
        this.profileSvg =
                page.locator("//*[local-name() = 'svg' and @data-test-id='menu-toggle-guest']/*[local-name()='title' and text()='Профиль']/..");
        this.logInBtn = page.locator("//div/a[contains(text(),'Войти')]");
        this.writePublicationBtn =
                page.locator("//*[local-name()='svg']/*[local-name()='title' and text()='Написать публикацию']/..");
        this.userProfileSvg = page.locator("//div[@data-test-id='menu-toggle-user']");
        this.settingProfileBtn = page.locator("//span[contains(text(),'Настройки профиля')]");
        this.exitBtn = page.locator("//span[contains(text(),'Выход')]");
        this.allStreamBtn = page.locator("//a[contains(text(),'Все потоки')]");

    }
    public void getToLogIn() {
        profileSvg.click();
        logInBtn.click();
    }


    public void logOut() {
        userProfileSvg.click();
        exitBtn.click();
    }




}
