package com.adp.practical;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListClass {

    LinkedList linkedList;
    Stack stack;

    List list;

    public void createLinkedList(){
        linkedList = new LinkedList();

        linkedList.addFirst("one");
        linkedList.add("two");
        linkedList.add("three");

        System.out.println("Head is: "+linkedList.getFirst());
        System.out.println("Tail is: "+linkedList.getLast());

    }       //end createLinkedList()


    public void createStack(){
        stack = new Stack();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println("Top value is: "+stack.pop());
        System.out.println("Top value is: "+stack.pop());

    }       //end createStack()

    public void createList(){
        list = new Vector();

        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println("Index of three is: "+list.indexOf("three"));
    }


}       //end class
