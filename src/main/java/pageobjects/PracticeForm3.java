package pageobjects;

import data.User2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeForm3 {
    @FindBy(id = "firstName")
    WebElement name;
    //    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(id = "userNumber")
    WebElement mobile;
    //   @FindBy(id = "subjectsInput")
    WebElement subjects;
    public void prefillForm(User2 user){
        this.name.sendKeys(user.getName());
        //     this.email.sendKeys(user.getEmail());
        this.mobile.sendKeys(user.getMobile());
        //     this.subjects.sendKeys(user.getSubjects());

    }
    public void prefillForm(String name, String phone){
        this.name.sendKeys(name);
        //     this.email.sendKeys(email);
        this.mobile.sendKeys(phone);
        //    this.subjects.sendKeys((CharSequence) subjects);
    }

}

