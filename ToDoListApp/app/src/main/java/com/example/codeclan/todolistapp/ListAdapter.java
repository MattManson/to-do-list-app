package com.example.codeclan.todolistapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Weasel on 08/01/2018.
 */

public class ListAdapter extends ArrayAdapter <Task> {


    public ListAdapter(Context context, ArrayList<Task> tasks) {
        super(context, 0, tasks);
    }
    @Override
    public view getView

}
