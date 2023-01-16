//package Util;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import java.io.File;
//import java.io.IOException;
//
//public class Screen {
//    public class Screen {
//        public static void takeScreen(WebDriver driver, String fileName){
//            File screenshotfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            try {
//                FileUtils.copyFile(screenshotfile,new File("screen/",fileName+".png"));
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
