package com.adp.practical;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    Map map;

    public void createMap(){
        map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Value at two is: "+map.get("two"));
    }


}
