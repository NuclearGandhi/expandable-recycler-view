package com.thoughtbot.expandablerecyclerview.listeners;

import com.thoughtbot.expandablerecyclerview.models.IExpandableGroup;

public interface GroupExpandCollapseListener {

    /**
     * Called when a group is expanded
     *
     * @param group the {@link IExpandableGroup} being expanded
     */
    void onGroupExpanded(IExpandableGroup group);

    /**
     * Called when a group is collapsed
     *
     * @param group the {@link IExpandableGroup} being collapsed
     */
    void onGroupCollapsed(IExpandableGroup group);
}
