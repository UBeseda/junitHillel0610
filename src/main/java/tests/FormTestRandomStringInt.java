package tests;

import configuration.BaseClass;
import data.DataProvider2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.PracticeForm2;

public class FormTestRandomStringInt extends BaseClass {

    static final String mainURL= "https://demoqa.com/automation-practice-form";
    static PracticeForm2 practiceForm2 = PageFactory.initElements(driver,PracticeForm2.class);
    @Before
    public void before(){
        if(!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://demoqa.com/automation-practice-form");
        }
    }
    @Test

    public void FormTestRandomStringInt() {
        //     driver.get("https://demoqa.com/automation-practice-form"); // ВИНЕСЛИ відкриття головн. сторінки в @Before
        practiceForm2.prefillForm(DataProvider2.getRandomString());
    }
}