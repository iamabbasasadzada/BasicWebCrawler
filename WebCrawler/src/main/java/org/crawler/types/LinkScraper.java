package org.crawler.types;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LinkScraper {

    public static void linkScraperMethod(String url) throws IOException {
        Document doc = Jsoup.connect(url).ignoreContentType(true).get();
        Elements links = doc.select("a[href]");
        for (Element link:links) {
            System.out.println("Link:"+link.attr("href"));
            System.out.println("Title:"+link.text());
        }
    }
}
