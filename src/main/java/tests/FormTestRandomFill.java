//Написати тест, який буде заповнювати в поля рандомні назви із листа, який ми вручну створимо за допомогою DataProvider
package tests;

import configuration.BaseClass;
import data.DataProvider;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.PracticeForm;


public class FormTestRandomFill extends BaseClass {
    static final String mainURL= "https://demoqa.com/automation-practice-form";
    static PracticeForm practiceForm = PageFactory.initElements(driver,PracticeForm.class);
    @Before
    public void before(){
        if(!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://demoqa.com/automation-practice-form");
        }
    }
    @Test

    public void FormTestRandomFill() {
        //     driver.get("https://demoqa.com/automation-practice-form"); // ВИНЕСЛИ відкриття головн. сторінки в @Before
        practiceForm.prefillForm(DataProvider.getRandomUser());
    }
}


