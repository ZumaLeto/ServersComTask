package page;

import com.microsoft.playwright.Page;

public class StartPage extends BasePage {
    public StartPage(Page page) {
        super(page);
    }

    public void getToLogIn() {
        profileSvg.click();
        logInBtn.click();
    }

    public void getToEditProfile() {
        userProfileSvg.click();
        settingProfileBtn.click();
    }
}
