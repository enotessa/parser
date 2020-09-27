package com.epam.parser;

import com.epam.maven.SiteCodeReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void parser(){
        Parser parser = new Parser();
        SiteCodeReader rp = new SiteCodeReader();
        String site = "https://bash.im/quote/454600";
        String html = rp.readSiteCode(site);
        String a = "ххх: расскажите пожалуйста про свою диету. Что нужно кушать что бы снились такие интересные сны?\n" +
                "\n" +
                "yyy: этим и отличаются писатели - с умом, который умеет придумывать, от потребителей, которым для придумывания нужны наркотики.\n" +
                "\n" +
                "zzz: yyy, как вы странно и длинно сказали \"своей дури хватает\".";
        assertEquals(a, (parser.returnQuote(html, 454600)));
    }
}
