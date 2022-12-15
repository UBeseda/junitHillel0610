//package tests;
//
//import configuration.BaseClass;
//import data.DataProvider3;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.support.PageFactory;
//import pageobjects.PracticeForm3;
//
//public class TestForm3 extends BaseClass {
//
//    static final String mainURL= "https://demoqa.com/automation-practice-form";
//    static PracticeForm3 practiceForm3 = PageFactory.initElements(driver,PracticeForm3.class);
//    @Before
//    public void before(){
//        if(!driver.getCurrentUrl().equals(mainURL)) {
//            driver.get("https://demoqa.com/automation-practice-form");
//        }
//    }
//    @Test
//
//    public void FormTestRandomStringInt() {
//        //     driver.get("https://demoqa.com/automation-practice-form"); // ВИНЕСЛИ відкриття головн. сторінки в @Before
//        practiceForm3.prefillForm(DataProvider3.getRandomString());
//        practiceForm3.prefillForm(DataProvider3.getRandomInt());
//    }
//}
//
