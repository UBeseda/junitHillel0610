package configuration;

import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver create(BROWSERS browsers) {
        switch (browsers) {
            case CHROMEINCOGNITO -> createChrome();
            case FIREFOX -> createFirefox();
            case CHROMEWITHPROXY -> createChromeProxy();
        }
        return driver;
    }

    private static void createChrome() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    private static void createFirefox() {

    }

    private static void createChromeProxy() {
        //Cтворення самого proxy сервера (біблітека, яку ми додади в pom.xml)
        BrowserMobProxyServer server = new BrowserMobProxyServer();
        server.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT); //цю строку вставляти, якщо збирати HAR файли/логи

        server.setTrustAllServers(true);
        server.start();
        BaseProxy.serverBaseClass = server;

        //Драйвер приймає у себе тільки Seleniun option, тому ми створюємо ще один об'єкт seleniumProxy
        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(server);
        String hostIp = null;
        try {
            hostIp = Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        seleniumProxy.setHttpProxy(hostIp + ":" + server.getPort());
        seleniumProxy.setSslProxy(hostIp + ":" + server.getPort());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
        capabilities.setAcceptInsecureCerts(true);

        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
        driver = new ChromeDriver(options);
    }
}
