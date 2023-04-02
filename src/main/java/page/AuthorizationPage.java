package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AuthorizationPage {

    Page page;
    Locator emailFld;
    Locator passwordFld;
    Locator logInBtn;

    public AuthorizationPage(Page page) {
        this.page = page;
        this.emailFld =  page.locator("//input[@type='email']");
        this.passwordFld = page.locator("//input[@type='password']");
        this.logInBtn = page.locator("//button[@type='submit']");
    }

    public void authorization() {
        emailFld.fill("razlac94@yandex.ru");
        passwordFld.fill("ForTestsNeedPas");
        logInBtn.click();
    }

}
