package com.adp.practical;

import org.junit.Test;

public class ListClassTest {

    ListClass listClass = new ListClass();

    @Test
    public void testCreateLinkedList() {
        listClass.createLinkedList();
    }

    @Test
    public void testCreateStack(){
        listClass.createStack();
    }

    @Test
    public void testCreateList(){
        listClass.createList();
    }

}
