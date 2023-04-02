package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ArticlePage extends BasePage {
    Locator bookmarksBtn = page.locator("(//button[@title='Добавить в закладки'])[1]");

    public ArticlePage(Page page) {
        super(page);
    }

    public ArticlePage makeBookmarks() {
        bookmarksBtn.scrollIntoViewIfNeeded();
        bookmarksBtn.click();
        return this;
    }

    public ArticlePage getToWritePublication() {
        writePublicationBtn.click();
        return this;
    }
}
