package com.thoughtbot.expandablecheckrecyclerview.models;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.SimpleExpandableGroup;

import java.util.Arrays;
import java.util.List;

/**
 * An extension of SimpleExpandableGroup that holds onto the checked state of it's children
 */
public abstract class CheckedExpandableGroup extends SimpleExpandableGroup {

    private boolean[] selectedChildren;

    CheckedExpandableGroup(String title, List items) {
        super(title, items);
        selectedChildren = new boolean[items.size()];
        for (int i = 0; i < items.size(); i++) {
            selectedChildren[i] = false;
        }
    }

    void checkChild(int childIndex) {
        selectedChildren[childIndex] = true;
    }

    void unCheckChild(int childIndex) {
        selectedChildren[childIndex] = false;
    }

    public boolean isChildChecked(int childIndex) {
        return selectedChildren[childIndex];
    }

    public void clearSelections() {
        if (selectedChildren != null) {
            Arrays.fill(selectedChildren, false);
        }
    }

    CheckedExpandableGroup(Parcel in) {
        super(in);
        selectedChildren = in.createBooleanArray();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeBooleanArray(selectedChildren);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public abstract void onChildClicked(int childIndex, boolean checked);

}
