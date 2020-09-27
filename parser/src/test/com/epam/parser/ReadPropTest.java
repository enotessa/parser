package com.epam.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadPropTest {

    @Test
    public void readPropertiesStr() {
        PropertyReader rp = new PropertyReader();
        String site1 = "https://bash.im/quote/";
        assertEquals(site1, (rp.readPropertiesStr("url")));
    }
}