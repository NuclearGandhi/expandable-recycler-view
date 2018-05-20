package com.thoughtbot.expandablerecyclerview.listeners;

import com.thoughtbot.expandablerecyclerview.models.IExpandableGroup;

public interface ExpandCollapseListener {

    /**
     * Called when a group is expanded
     *
     * @param positionStart the flat position of the first child in the {@link IExpandableGroup}
     * @param itemCount     the total number of children in the {@link IExpandableGroup}
     */
    void onGroupExpanded(int positionStart, int itemCount);

    /**
     * Called when a group is collapsed
     *
     * @param positionStart the flat position of the first child in the {@link IExpandableGroup}
     * @param itemCount     the total number of children in the {@link IExpandableGroup}
     */
    void onGroupCollapsed(int positionStart, int itemCount);
}
