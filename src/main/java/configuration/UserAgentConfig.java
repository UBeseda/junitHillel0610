package configuration;

import net.lightbody.bmp.BrowserMobProxyServer;

public class UserAgentConfig {
    public static void createUserAgent(USERAGENT useragent, BrowserMobProxyServer server) {
        switch (useragent) {
             case ANDROIRU -> createAndroidRuAgent(server);
          //   case ANDROIDEN -> createAndroidEN(server);
          //   case ANDROIDES -> createAndroidES(server);
        }
    }

//    private static void createAndroidES(BrowserMobProxyServer server) {
//        server.addRequestFilter((request, contents, messageInfo) -> {
//            request.headers().remove("user-agent");
//            request.headers().remove("Accept-Language");
//            request.headers().remove("Content-Language");
//            request.headers().add("User-Agent", "Mozilla/5.0 (Linux; Android 4.4; Nexus 5 Build/_BuildID_) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Mobile Safari/537.36");
//            request.headers().add("Accept-Language", "es");
//            request.headers().add("Content-Language", "es_ES");
//
//            request.headers().remove("Referer");
//
//            return null;
//        });
//    }

//    private static void createAndroidEN(BrowserMobProxyServer server) {
//        server.addRequestFilter((request, contents, messageInfo) -> {
//            request.headers().remove("user-agent");
//            request.headers().remove("Accept-Language");
//            request.headers().remove("Content-Language");
//            request.headers().add("User-Agent", "Mozilla/5.0 (Linux; Android 4.4; Nexus 5 Build/_BuildID_) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Mobile Safari/537.36");
//            request.headers().add("Accept-Language", "en");
//            request.headers().add("Content-Language", "en_EN");
//
//            request.headers().remove("Referer");
//
//            return null;
//        });
//    }

    private static void createAndroidRuAgent(BrowserMobProxyServer server) {
        server.addRequestFilter((request, contents, messageInfo) -> {
            request.headers().remove("user-agent");
            request.headers().remove("Accept-Language");
            request.headers().remove("Content-Language");
            request.headers().add("User-Agent", "Mozilla/5.0 (Linux; Android 4.4; Nexus 5 Build/_BuildID_) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Mobile Safari/537.36");
            request.headers().add("Accept-Language", "ES");
            request.headers().add("Content-Language", "es_ES");

            request.headers().remove("Referer");

            return null;
        });

    }

    }

