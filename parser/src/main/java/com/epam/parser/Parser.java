package com.epam.parser;

/**
 * Class take quotes (trimming html code)
 */
public class Parser {

    /**
     * Taking a quote (cropping html code)
     * @param html the line that stores the html code of the page
     * @param number quote number
     * @return quote
     */
    public static String returnQuote(String html, int number){
        System.out.println("Цитата №"+number);
        System.out.println("\n");
        PropertyReader rp = new PropertyReader();

        String quote;
        String regex11 = rp.readPropertiesStr("regex11");
        String regex12 = rp.readPropertiesStr("regex12");
        String regex1 = regex11 + regex12;
        String regex2 = rp.readPropertiesStr("regex2");


        quote = html.split(regex1, 2)[0];
        String[] parts = quote.split(regex2);
        quote = parts[1];
        String str = quote.replaceAll("&#13;&#10;", "\n");
        String str2 = str.replaceAll("&quot;", "\"");
        str2 = str2.replaceAll("&lt;","<");
        str2 = str2.replaceAll("&gt;",">");
        return str2;

    }

}
