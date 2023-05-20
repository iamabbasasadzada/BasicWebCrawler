package org.crawler.types;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ImageScraper {

    public static void imageScraperMethod(String url) throws IOException {
        Document doc = Jsoup.connect(url).ignoreContentType(true).get();
        Elements images = doc.getElementsByTag("img");
        System.out.println("Images sources:");
        for (Element src : images){
            System.out.println("src:"+src.attr("abs:src"));
        }
    }

}
