package com.bdd.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtilities {


    /**
     *
     * @param time in seconds
     * @throws InterruptedException
     */
    public static void sleep(int time) throws InterruptedException {
        time *= 1000;
        Thread.sleep(time);
    }

    /**
     * Extract text of each web element from the given list
     * @param elements list of web elements
     * @return list of string containing the text of each web element
     */
    public static List<String> getWebElementsText(List<WebElement> elements){
        List<String> elementsText = new ArrayList<>();
        for (WebElement each : elements){
            elementsText.add(each.getText());
        }
        return elementsText;
    }
}
