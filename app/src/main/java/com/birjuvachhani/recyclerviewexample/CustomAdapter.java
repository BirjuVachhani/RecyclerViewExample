package com.birjuvachhani.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.birjuvachhani.recyclerviewexample.databinding.RowBinding;

import java.util.Collections;
import java.util.List;

/**
 * Created by birju.vachhani on 19/01/18.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private LayoutInflater inflater;
    private List<DataHolder> dataSet = Collections.emptyList();
    private Context context;

    public CustomAdapter(Context context, List<DataHolder> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RowBinding mrowBinding = RowBinding.inflate(inflater, parent, false);
        CustomViewHolder holder = new CustomViewHolder(context, mrowBinding);

        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        DataHolder data = dataSet.get(position);

        holder.bind(data);
        holder.mrowBinding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        Context context;
        RowBinding mrowBinding;

        public CustomViewHolder(final Context context, final RowBinding mrowBinding) {
            super(mrowBinding.getRoot());
            this.mrowBinding = mrowBinding;
            this.context = context;

            this.mrowBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DataHolder data = mrowBinding.getDataholder();
                    Intent intent = new Intent(context, DetailedActivity.class);
                    intent.putExtra(Constants.PARCEL_LABEL,data);
                    context.startActivity(intent);
                }
            });

        }

        public void bind(DataHolder dataHolder) {
            mrowBinding.setDataholder(dataHolder);
        }
    }

    @BindingAdapter("src")
    public static void setImageSrc(ImageView view, int imageId) {
        if (imageId != -1) {
            view.setImageResource(imageId);
        }
    }
}
