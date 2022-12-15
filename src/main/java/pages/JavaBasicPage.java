package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaBasicPage {

    // Локаторы
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[1]/div/h1")
    WebElement Title;

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[2]/div/span")
    WebElement Rate;

    @FindBy(xpath ="//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]/div/p")
    WebElement Description;

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]/div/div/h3")
    WebElement Goals;

// Сам метод
    public WebElement getCourseTitle() {return Title;}

    public  WebElement getCourseDescription() {return Description;}

    public  WebElement getCourseRate() {return Rate;}

    public  WebElement getCourseGoals() {return Goals;}

}
