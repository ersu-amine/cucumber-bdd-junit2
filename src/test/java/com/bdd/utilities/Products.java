package com.bdd.utilities;

import java.io.IOException;
import java.util.*;

public final class Products {

    //named based on item numbers from UI html source
    private static final String[] ITEM0 = {"Sauce Labs Bike Light",
            "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
            "$9.99"};
    private static final String[] ITEM1 = {"Sauce Labs Bolt T-Shirt",
            "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.",
            "$15.99"};
    private static final String[] ITEM2 = {"Sauce Labs Onesie",
            "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
            "$7.99"};
    private static final String[] ITEM3 = {"Test.allTheThings() T-Shirt (Red)",
            "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.",
            "$15.99"};
    private static final String[] ITEM4 = {"Sauce Labs Backpack",
            "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
            "$29.99"};

    private static final String[] ITEM5 = {"Sauce Labs Fleece Jacket",
            "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.",
            "$49.99"};

    private static final String[] TITLES = {"Sauce Labs Bike Light",
            "Sauce Labs Bolt T-Shirt",
            "Sauce Labs Onesie",
            "Test.allTheThings() T-Shirt (Red)",
            "Sauce Labs Backpack",
            "Sauce Labs Fleece Jacket",
    };

    public static List<String> getTitles(){
        return Arrays.asList(TITLES);
    }

    public static List<String> getAllPrices(){
        List<String> list = new ArrayList<>();
        for (String[] each : ALLITEMS) {
            list.add(each[2]); //add price
        }
        return list;
    }
    private static final String[][] ALLITEMS = {ITEM1, ITEM2, ITEM3, ITEM4, ITEM5, ITEM0};

    //TODO not sure about this structuring
    public static  Map<String, Integer> productWebIndex = makeIndexMap();

    private static Map<String, Integer> makeIndexMap(){
        productWebIndex = new HashMap<>();
        productWebIndex.put(ITEM4[0],1);
        productWebIndex.put(ITEM0[0],2);
        productWebIndex.put(ITEM1[0],3);
        productWebIndex.put(ITEM5[0],4);
        productWebIndex.put(ITEM2[0],5);
        productWebIndex.put(ITEM3[0],6);
        return productWebIndex;
    }

    public static Map<String, List<String>> getAllItemsMap() {
        Map<String, List<String>> itemsMap = putAllListIntoMap(ALLITEMS);
        return itemsMap;
    }

    /**
     * @param items String array of String arrays , each array containing title, description and price of a product
     * @return map of information of product, title as key and list of description and price as value
     */
    private static Map<String, List<String>> putAllListIntoMap(String[][] items) {
        //create map to store all the lists
        Map<String, List<String>> itemsMap = new HashMap<>();
        //iterate over the 2D array adding each array item components to list
        for (String[] item : items) {
            List<String> list = new ArrayList<>();
            list.add(item[1]);
            list.add(item[2]);
            itemsMap.put(item[0], list);
        }
        return itemsMap;
    }
}
