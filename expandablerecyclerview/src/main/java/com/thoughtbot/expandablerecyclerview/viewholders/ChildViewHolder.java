package com.thoughtbot.expandablerecyclerview.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.thoughtbot.expandablerecyclerview.models.IExpandableGroup;

/**
 * ViewHolder for {@link IExpandableGroup#getItems()}
 */
public class ChildViewHolder extends RecyclerView.ViewHolder {

    protected ChildViewHolder(View itemView) {
        super(itemView);
    }
}
