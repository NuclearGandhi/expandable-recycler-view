package com.thoughtbot.expandablerecyclerview.models;

import java.util.List;

public interface IExpandableGroup<T> {

    List<T> getItems();

    int getItemCount();
}
