package configuration;

import Util.Screen;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.core.har.HarEntry;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BaseProxy extends BaseClass{
    public static BrowserMobProxyServer serverBaseClass;
    @BeforeClass
    static public void startProxy(){
        serverBaseClass.newHar("youtube"); /// цю строку вставляти, якщо збирати HAR файли/логи з сайта ютуб aбо підставити інше)
        UserAgentConfig.createUserAgent(USERAGENT.ANDROIRU, serverBaseClass);
    }
    @AfterClass
    static public void stopProxy() throws IOException {
        String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
        Har har = serverBaseClass.getHar();
        har.writeTo(new File("site.har"));
// Some code here ... (close browser, stop server)
        serverBaseClass.stop();
        Screen.takeScreen(driver, "Screenshot "+timeStamp);
     //   for (HarEntry entry : har.getLog().getEntries()) {
         //   System.out.println(entry);
         //   System.out.println (" "+entry.getTimings().getWait()); //вывод времени в логах
            // System.out.println (" "+entry.getTimings().getReceive());
       //     System.out.println (entry.getRequest().getUrl()); // вывод - куда попали/что открыли

        }
    }


