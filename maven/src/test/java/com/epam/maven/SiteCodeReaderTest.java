package com.epam.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SiteCodeReaderTest {


    @Test
    public void readSiteCodeTest(){
        SiteCodeReader rp = new SiteCodeReader();
        String url = "https://bash.im/quote/454600";
        System.out.println(rp.readSiteCode(url));
        //assert(rp.readSiteCode(url));
    }
}