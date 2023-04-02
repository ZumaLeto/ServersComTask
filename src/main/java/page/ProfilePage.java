package page;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;

public class ProfilePage extends BasePage {
    Locator fullNameFld;
    Locator specialityFld;
    Locator genderSlc;
    Locator birthDaySlc;
    Locator birthMonthSlc;
    Locator birthYearSlc;
    Locator countrySlc;
    Locator regionSlc;
    Locator citySlc;
    Locator saveChangeBtn;

    public ProfilePage(Page page) {
        super(page);
        this.fullNameFld = page.locator("//input[@name='fullname']");
        this.specialityFld = page.locator("//input[@name='speciality']");
        this.genderSlc = page.locator("//select[@name='gender']");
        this.birthDaySlc = page.locator("//select[@name='birthdayDay']");
        this.birthMonthSlc = page.locator("//select[@name='birthdayMonth']");
        this.birthYearSlc = page.locator("//select[@name='birthdayYear']");
        this.countrySlc = page.locator("//select[@name='locationCountryId']");
        this.regionSlc = page.locator("//select[@name='locationRegionId']");
        this.citySlc = page.locator("//select[@name='locationCityId']");
        this.saveChangeBtn = page.locator("//button[contains(text(),'Сохранить изменения')]");

    }

    public ProfilePage editFields() {
        fullNameFld.fill("Тест Тестович");
        specialityFld.fill("Тестерщик");
        genderSlc.selectOption(new SelectOption().setLabel("Мужской"));
        birthDaySlc.selectOption(new SelectOption().setLabel("14"));
        birthMonthSlc.selectOption(new SelectOption().setLabel("Февраль"));
        birthYearSlc.selectOption(new SelectOption().setLabel("1980"));
        countrySlc.selectOption(new SelectOption().setLabel("Сербия"));
        regionSlc.selectOption(new SelectOption().setLabel("Белград"));
        citySlc.selectOption(new SelectOption().setLabel("Белград"));
        return this;
    }

    public ProfilePage saveChanges() {
        saveChangeBtn.click();
        return this;
    }

    public ProfilePage getToAllStream() {
        allStreamBtn.click();
        return this;
    }




}
