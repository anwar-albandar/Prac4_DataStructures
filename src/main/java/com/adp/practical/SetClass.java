package com.adp.practical;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    Set set;

    public void createHashSet(){
        set = new HashSet();

        set.add("one");
        set.add("one");

        System.out.println("Size of the set: "+set.size());
    }

}
