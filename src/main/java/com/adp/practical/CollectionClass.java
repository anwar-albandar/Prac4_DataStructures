package com.adp.practical;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionClass {

    Collection collection;

    public void createList(){
        collection = new ArrayList();

        System.out.println("Size of collection: "+collection.size());
        System.out.println("List is empty: "+collection.isEmpty());
        collection.add("one");
        collection.add("two");
        collection.add("three");
        System.out.println("Size of collection: "+collection.size());
        System.out.println("List is empty: "+collection.isEmpty());

        System.out.println("Collection contains two: "+collection.contains("two"));
        collection.remove("two");
        System.out.println("Collection contains two: "+collection.contains("two"));
    }       //end createList()


}       //end class
