package org.crawler.types;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlTransform {

    public static void transformHtml() throws IOException {
        File file = new File("raw.html");
        Document doc = Jsoup.parse(file);

        Element tagMetaCharset = new Element(Tag.valueOf("meta"),"");
        tagMetaCharset.attr("charset","utf-8");
        doc.head().appendChild(tagMetaCharset);

        Element tagPDescription = new Element(Tag.valueOf("p"),"");
        tagPDescription.text("This is just a Test!");
        doc.body().appendChild(tagPDescription);
        tagPDescription.before("<p>Author:Abbas Asadzada</p>");

        Element tagPAuthor = doc.body().select("p:contains(Author)").first();
        tagPAuthor.attr("align","center");
        doc.body().addClass("content");

        System.out.println("Transferring...");

        FileWriter fw = new FileWriter("updated.html");
        fw.write(doc.toString());
        fw.close();
    }
}
