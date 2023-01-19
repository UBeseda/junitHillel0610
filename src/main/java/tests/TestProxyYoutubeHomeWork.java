package tests;

import configuration.BaseProxy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.YouTubePageObject;


public class TestProxyYoutubeHomeWork extends BaseProxy {
        static YouTubePageObject youTubePageObject = PageFactory.initElements(driver, YouTubePageObject.class);

        @BeforeClass
        public static void openPage() {
            driver.get("https://www.youtube.com/");
        }

        @Test
        public void test1() {
            youTubePageObject.sentInInputNoWar();
        }

    }


