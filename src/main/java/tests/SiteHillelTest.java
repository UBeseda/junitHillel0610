//Написать Page Factory or PageObject для страницы курса Java Basic (https://ithillel.ua/courses/introduction-kiev)
// в котором реализовать методы ( возвращают строку):
//getCourseTitle()
//getCourseRate()
//getCourseDescription()
//getCourseGoals()

package tests;

import configuration.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.JavaBasicPage;

public class SiteHillelTest extends BaseClass {
    static final String mainURL= "https://ithillel.ua/courses/introduction-kiev";
    static JavaBasicPage javaBasic = PageFactory.initElements(driver, JavaBasicPage.class);

    @Before
    public void before(){
        if(!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://ithillel.ua/courses/introduction-kiev");
        }
    }
    @Test

    public void SiteHillelTest() {
        // driver.get("https://demoqa.com/automation-practice-form"); // ВИНЕСЛИ відкриття головн. сторінки в @Before
         System.out.println(javaBasic.getCourseTitle().getText());
         System.out.println(javaBasic.getCourseDescription().getText());
        System.out.println(javaBasic.getCourseRate().getText());
         System.out.println(javaBasic.getCourseGoals().getText());
    }
}
