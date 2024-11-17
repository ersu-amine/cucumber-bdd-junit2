package com.bdd.utilities;

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
}
