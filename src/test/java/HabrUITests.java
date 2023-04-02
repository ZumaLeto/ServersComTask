import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.*;

public class HabrUITests {
    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;
    String basicURL = "https://habr.com/ru/all/";

    @BeforeEach
    void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
        page.setDefaultTimeout(40000);
        page.navigate(basicURL);
    }

    @Test
    public void test() {
        new BasePage(page).getToLogIn();
        new AuthorizationPage(page).authorization();
        new StartPage(page).getToEditProfile();
        new ProfilePage(page)
                .editFields()
                .saveChanges()
                .getToAllStream();
        new ArticlePage(page)
                .makeBookmarks()
                .getToWritePublication();
        new PublicationPage(page)
                .writePublication()
                .logOut();

    }


    @AfterEach
    void closeBrowser() {
        playwright.close();
    }
}
