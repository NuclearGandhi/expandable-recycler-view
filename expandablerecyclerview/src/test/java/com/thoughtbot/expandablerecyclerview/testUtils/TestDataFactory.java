package com.thoughtbot.expandablerecyclerview.testUtils;

import com.thoughtbot.expandablerecyclerview.models.SimpleExpandableGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDataFactory {

    public static List<SimpleExpandableGroup> makeGroups() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 6; i++) {
            List items = Arrays.asList(i + ".0", i + ".1", i + ".2");
            list.add(new SimpleExpandableGroup("Section " + i, items));
        }
        return list;
    }

}
