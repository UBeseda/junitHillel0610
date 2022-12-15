//package tests;
//
//import configuration.BaseClass;
//import data.DataProvider;
//import data.User;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.openqa.selenium.support.PageFactory;
//import pageobjects.PracticeForm;
//import java.util.Collection;
//
////import static org.junit.Assert.assertEquals;
//@RunWith(Parameterized.class)
//public class FormTestParametric {
//
//    public class FormTestParametric extends BaseClass {
//        static final String mainURL= "https://demoqa.com/automation-practice-form";
//        private static org.openqa.selenium.support.PageFactory PageFactory;
//        static PracticeForm practiceForm = PageFactory.initElements(driver,PracticeForm.class);
//
//        private User user;
//
//        public FormTestParametric(User user) {
//            this.user = user;
//        }
//        @Parameterized.Parameters
//        public static Collection getParams(){
//            return DataProvider.getUserList();
//        }
//
//
//        @Before
//        public void before(){
//            if(!driver.getCurrentUrl().equals(mainURL)) {
//                driver.get("https://demoqa.com/automation-practice-form");
//            }
//        }
//        @Test
//
//        public void FormTestParametric() {
//            //     driver.get("https://demoqa.com/automation-practice-form"); // ВИНЕСЛИ відкриття головн. сторінки в @Before
//             practiceForm.prefillForm(user);
//        }
//    }
//}
