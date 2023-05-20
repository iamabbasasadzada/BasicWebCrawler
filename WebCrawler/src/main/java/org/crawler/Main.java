package org.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.logging.Logger;

import static org.crawler.types.HtmlTransform.transformHtml;
import static org.crawler.types.ImageScraper.imageScraperMethod;
import static org.crawler.types.LinkScraper.linkScraperMethod;
import static org.crawler.types.TitleScraper.titleScraperMethod;
import static org.crawler.types.UserAgentS.useUserAgent;

public class Main {
    public static void main(String[] args) {
        System.setProperty("http.proxyhost","127.3.1.5");
        System.setProperty("http.proxyport","2145");
        try{
//            titleScraperMethod("https://www.google.com/");
//            linkScraperMethod("https://www.wikipedia.org/");
//            imageScraperMethod("https://en.wikipedia.org/wiki/England");
//            transformHtml();
            useUserAgent();
        }
        catch(IOException exception){
            System.out.println("There is a problem!");
        }
    }


}