package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PublicationPage extends BasePage {
    Page page;
    Locator titleFld;
    Locator textFld;
    Locator quoteBtn;
    Locator listBtn;
    Locator lastBlockquoteFld;
    Locator lastListFld;

    public PublicationPage(Page page) {
        super(page);
        this.page = page;
        this.titleFld = page.locator("//h1[@class='title']");
        this.textFld = page.locator("//div[@data-empty-text='Введите текст']");
        this.quoteBtn = page.locator("//button[contains(text(),'Цитата')]");
        this.listBtn = page.locator("//button[contains(text(),'Список')]");
        this.lastBlockquoteFld = page.locator("(//div[@class='blockquote']/div)[last()]");
        this.lastListFld = page.locator("(//div[@class='list']/ul/li/div)[last()]");
    }

    public PublicationPage writePublication() {
        titleFld.fill("Тестовый заголовок");
        textFld.fill("Тестовый текст");
        page.keyboard().press("Enter");
        textFld.fill("/");
        quoteBtn.click();
        lastBlockquoteFld.fill("Тестовая цитата");
        textFld.fill("/");
        listBtn.click();
        lastListFld.fill("Первый пункт");
        page.keyboard().press("Enter");
        lastListFld.fill("Второй пункт");
        page.keyboard().press("Enter");
        page.keyboard().press("Enter");
        return this;
    }

}
