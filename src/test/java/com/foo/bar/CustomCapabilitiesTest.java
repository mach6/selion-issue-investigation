package com.foo.bar;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.grid.Grid;

public class CustomCapabilitiesTest {
    @WebTest
    @Test
    public void testItCanBeSo() {
        // does nothing other than launch a browser and close it
        assertNotNull(Grid.driver());
    }
}
