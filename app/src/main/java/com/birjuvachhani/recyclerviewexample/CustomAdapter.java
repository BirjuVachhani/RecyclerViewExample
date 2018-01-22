package com.birjuvachhani.recyclerviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by birju.vachhani on 19/01/18.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private LayoutInflater inflater;
    private List<DataHolder> dataSet;
    private Context context;

    public CustomAdapter(Context context, List<DataHolder> dataSet)
    {
        this.context=context;
        this.dataSet=dataSet;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.layout_single_row,parent,false);
        CustomViewHolder holder=new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        DataHolder data=dataSet.get(position);

        holder.mtitle.setText(data.getTitle());
        holder.mdesc.setText(data.getDesc());
        holder.mimg.setImageResource(data.getImageId());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        ImageView mimg;
        TextView mtitle;
        TextView mdesc;

        public CustomViewHolder(View itemView) {
            super(itemView);

            mimg=(ImageView)itemView.findViewById(R.id.iv_img);
            mtitle=(TextView)itemView.findViewById(R.id.tv_title);
            mdesc=(TextView)itemView.findViewById(R.id.tv_desc);

        }
    }
}
