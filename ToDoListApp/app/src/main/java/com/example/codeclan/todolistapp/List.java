package com.example.codeclan.todolistapp;

import java.util.ArrayList;

/**
 * Created by Weasel on 08/01/2018.
 */

public class List {

    private ArrayList<Task> list;

    public List(){
        list = new ArrayList<Task>();
        list.add(new Task("Android Project", "code to-do list app in android studio, complete UI, complete powerpoint, present", Category.STUDY, Priority.HIGH, false ));
        list.add(new Task("Make Dinner", "marinate chicken in yoghurt, mix flour and spices, dredge chicken, deep fry, serve with coleslaw", Category.FOOD, Priority.MEDIUM, false));
        list.add(new Task("Clean Kitchen", "sweep and mop floor, clean surfaces, clean fridge, wash dishes", Category.CLEANING, Priority.MEDIUM, false));
        list.add(new Task("Learn Crypto", "begin crypto/hacking challenges on cryptopals", Category.PERSONAL, Priority.LOW, false));
    }

    public int getSize() {
        return list.size();
    }

    public void addTask(Task task) {
        list.add(task);
    }
}
