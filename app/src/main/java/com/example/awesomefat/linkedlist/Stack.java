package com.example.awesomefat.linkedlist;

import android.text.Layout;
import android.widget.LinearLayout;

import java.util.*;

/**
 * Created by Brian Scott on 2/16/2016.
 */
public class Stack extends LinkedList
{
    public Stack(LinearLayout layout)
    {
        super(layout);
    }

    public Node peek()
    {
        return this.getAtIndex(0);
    }

    public Node pop()
    {
        return this.removeFront();
    }

    public void push(String value)
    {
        this.addFront(value);
    }
}
