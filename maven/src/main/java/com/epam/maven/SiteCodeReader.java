package com.epam.maven;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Html code taking class
 */
public class SiteCodeReader {

    /**
     * read page code into String
     * @param site page address
     * @return page code
     */
    public static String readSiteCode(String site) {
        StringBuilder sb = new StringBuilder();
        try {
            for(Scanner sc = new Scanner(new URL(site).openStream()); sc.hasNext(); )
                sb.append(sc.nextLine()).append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
