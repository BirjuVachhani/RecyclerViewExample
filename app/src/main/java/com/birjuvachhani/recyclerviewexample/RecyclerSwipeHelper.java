package com.birjuvachhani.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by birju.vachhani on 24/01/18.
 */

public class RecyclerSwipeHelper extends ItemTouchHelper.SimpleCallback {

    private CustomAdapter adapter;

    public RecyclerSwipeHelper(int dragDirs, int swipeDirs, CustomAdapter adapter) {
        super(dragDirs, swipeDirs);
        this.adapter = adapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        adapter.removeItem(viewHolder.getAdapterPosition());
    }
}
