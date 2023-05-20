package org.crawler.types;

import org.jsoup.Jsoup;

import java.io.IOException;

public class UserAgentS {

    public static void useUserAgent() throws IOException {
        String text = Jsoup.connect("https://useragentstring.com/").userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.0.0 Safari/537.36")
                .get().text();
        System.out.println(text);
    }
}
