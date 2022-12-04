package Tests;

import configuration.BaseClass;
import data.User;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.PracticeForm;

public class FormTest extends BaseClass {
    static final String mainURL= "https://demoqa.com/automation-practice-form";
   static PracticeForm practiceForm = PageFactory.initElements(driver,PracticeForm.class);
   @Before
   public void before(){
      if(!driver.getCurrentUrl().equals(mainURL)) {
           driver.get("https://demoqa.com/automation-practice-form");
      }
   }
    @Test

    public void formTest() {
   //     driver.get("https://demoqa.com/automation-practice-form"); // ВИНЕСЛИ відкриття головн. сторінки в @Before
        practiceForm.prefillForm(new User());
    }
}
