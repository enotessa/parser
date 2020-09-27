package com.epam.maven;
import com.epam.parser.Parser;
import com.epam.parser.PropertyReader;

import java.util.Scanner;
import static java.lang.System.out;


/**
 * @author Anastasiia_Pokamestova
 * The main class that runs the program
*/
public class MainClass {
    /**
     * the beginning of the program
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        /**
         * variable and class declaration
         */
        PropertyReader rp = new PropertyReader();
        SiteCodeReader SiteCode = new SiteCodeReader();
        Parser Cut = new Parser();
        String html, quote;

        /**
         * console menu
         */
        for (; ; ) {
            out.println("1 : Ввести номер цитаты #****** (6 цифр)");
            out.println("0 : Выход");

            out.println("Введите пункт:");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num) {

                case 1:
                    out.println("\n\n");
                    out.println("Введите номер цитаты (6 цифр)(например, 454600)");
                    String site = rp.readPropertiesStr("url");
                    int number = in.nextInt();
                    site += number;
                    out.println(site);
                    out.println("\n\n");

                    html = SiteCode.readSiteCode(site);
                    quote = Cut.returnQuote(html, number);
                    out.println(quote);

                    out.println("\n\n");
                    break;

                case 0:
                    out.println("\n\n");
                    System.exit(0);
                    out.println("\n\n");
                    break;

                default:
                    out.println("\n\n");
                    out.println("Неизвестный ввод");
                    out.println("\n");
                    break;
            }
        }
    }
}
