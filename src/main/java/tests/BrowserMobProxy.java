
//Д/з Используя прокси подменить "Accept-Language" на "ru" и  "Content-Language" на "ru_RU"
//перейти по ссылке https://www.youtube.com/
//в поисковой строке ввести "no war"
//программа должна автоматически сделать скриншиот странички с результатами.

//package tests;

//import configuration.BaseProxy;
//import org.bouncycastle.operator.KeyWrapper;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.*;
//
//import java.io.File;
//import java.io.IOException;
//
//public class BrowserMobProxy {
//    package tests;
//
//import configuration.BaseProxy;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//    public class BrowserMobProxy extends BaseProxy {

//Подміна язика
//publiс static void createRuLanguage(BrowserMobProxyServer server) {
//    server.addRequestFilter((request, contents, messageInfo) -> {
//        request.headers().remove("Accept-Language");
// request.headers().remove("Сontent-Language");
//        request.headers().add("Accept-Language", "es");
// request.headers().add("Content-Language", "es-Es")
// }
//        @BeforeClass
//        public static void openPage() {
//            driver.get("https://www.youtube.com/");
//        }
//
//        @Test
//        public void test1() {
//            System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.id("search-input")).sendKeys("No war");
//        driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
//    }
//
//            }
//        }
//
//
