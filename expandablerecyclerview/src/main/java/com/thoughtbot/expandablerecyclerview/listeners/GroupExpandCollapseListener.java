package com.thoughtbot.expandablerecyclerview.listeners;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.models.LightExpandableGroup;

public interface GroupExpandCollapseListener {

  /**
   * Called when a group is expanded
   * @param group the {@link ExpandableGroup} being expanded
   */
  void onGroupExpanded(LightExpandableGroup group);

  /**
   * Called when a group is collapsed
   * @param group the {@link ExpandableGroup} being collapsed
   */
  void onGroupCollapsed(LightExpandableGroup group);
}
