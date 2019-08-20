package com.herokuapp;

import org.testng.annotations.Test;
import page.Page;


public class AvailableExamplesTests extends Page {

    @Test
    public void test() {
        openPage("/");
    }
}
