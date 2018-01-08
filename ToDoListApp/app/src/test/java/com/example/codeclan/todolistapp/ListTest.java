package com.example.codeclan.todolistapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Weasel on 08/01/2018.
 */

public class ListTest {
    List list;

    @Before
    public void before(){
        list = new List();
    }

    @Test
    public void getListSizeTest(){
        assertEquals(4, list.getSize());
    }

    @Test
    public void canAddToListTest(){
        list.addTask(new Task("Games Night", "invite friends, play games, drink beer", Category.PERSONAL, Priority.MEDIUM, false));
        assertEquals(5, list.getSize());
    }
}
