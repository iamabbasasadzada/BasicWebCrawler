package org.crawler.types;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class TitleScraper {
    public static void titleScraperMethod(String url) throws IOException {
        Document doc = Jsoup.connect(url).ignoreContentType(true).get();;
        String title = doc.title();
        System.out.println("Title:"+title);
    }
}
