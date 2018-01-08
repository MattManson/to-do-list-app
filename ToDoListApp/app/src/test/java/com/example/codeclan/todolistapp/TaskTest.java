package com.example.codeclan.todolistapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Weasel on 08/01/2018.
 */

public class TaskTest {

    Task task1;
    @Before
    public void before(){
        task1 = new Task("Android project", "code to-do list app in android studio, complete UI, complete powerpoint, present", Category.STUDY, Priority.HIGH, false );
    }

    @Test
    public void getTitleTest(){
        assertEquals("Android project", task1.getTitle());
    }

    @Test
    public void setTitleTest(){
        task1.setTitle("to-do list app");
        assertEquals("to-do list app", task1.getTitle());
    }

    @Test
    public void getDescriptionTest(){
        assertEquals("code to-do list app in android studio, complete UI, complete powerpoint, present", task1.getDescription());
    }

    @Test
    public void setDescriptionTest(){
        task1.setDescription("words");
        assertEquals("words", task1.getDescription());
    }

    @Test
    public void getCategoryTest(){
        assertEquals(Category.STUDY, task1.getCategory());
    }

    @Test
    public void setCategoryTest(){
        task1.setCategory(Category.PERSONAL);
        assertEquals(Category.PERSONAL, task1.getCategory());
    }

    @Test
    public void getPriorityTest(){
        assertEquals(Priority.HIGH, task1.getPriority());
    }

    @Test
    public void setPriorityTest(){
        task1.setPriority(Priority.MEDIUM);
        assertEquals(Priority.MEDIUM, task1.getPriority());
    }

    @Test
    public void getCompletedTest(){
        assertEquals(false, task1.getCompleted());
    }

    @Test
    public void setCompletedTest(){
        task1.setCompleted(true);
        assertEquals(true, task1.getCompleted());
    }
}
