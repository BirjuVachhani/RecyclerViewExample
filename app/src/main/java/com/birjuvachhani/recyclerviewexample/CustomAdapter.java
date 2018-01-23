package com.birjuvachhani.recyclerviewexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by birju.vachhani on 19/01/18.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private LayoutInflater inflater;
    private List<DataHolder> dataSet= Collections.emptyList();
    private Context context;

    public CustomAdapter(Context context, List<DataHolder> dataSet)
    {
        this.context=context;
        this.dataSet=dataSet;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.layout_single_row,parent,false);
        CustomViewHolder holder=new CustomViewHolder(context, view);

        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        DataHolder data=dataSet.get(position);

        holder.mtitle.setText(data.getTitle());
        holder.mdesc.setText(data.getDesc());
        holder.mimg.setImageResource(data.getThumbId());
        holder.imageId=data.getImageId();

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.iv_img) ImageView mimg;
        @BindView(R.id.tv_title) TextView mtitle;
        @BindView(R.id.tv_desc) TextView mdesc;
        int imageId;
        Context context;

        public CustomViewHolder(final Context context, View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,DetailedActivity.class);
                    intent.putExtra(Constants.IMAGE_LABEL,imageId);
                    intent.putExtra(Constants.TITLE_LABEL,mtitle.getText());
                    intent.putExtra(Constants.DESC_LABEL,mdesc.getText());
                    context.startActivity(intent);
                }
            });

        }
    }
}
