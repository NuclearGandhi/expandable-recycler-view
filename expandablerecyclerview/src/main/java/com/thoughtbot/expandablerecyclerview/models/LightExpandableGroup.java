package com.thoughtbot.expandablerecyclerview.models;

import java.util.List;

public interface LightExpandableGroup<T> {

    List<T> getItems();

    int getItemCount();
}
