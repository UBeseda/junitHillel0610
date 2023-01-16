package tests;

import configuration.BaseProxy;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestProxyYoutube extends BaseProxy {
    @BeforeClass
    public static void openPage(){
        driver.get("https://www.youtube.com/");
    }
    @Test
    public void test1(){
        System.out.println(driver.getCurrentUrl());
    }
}
