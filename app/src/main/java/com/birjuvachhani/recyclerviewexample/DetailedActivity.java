package com.birjuvachhani.recyclerviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    private ImageView mimg;
    private TextView mtitle;
    private TextView mdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        mimg=(ImageView)findViewById(R.id.iv_img);
        mtitle=(TextView)findViewById(R.id.tv_title);
        mdesc=(TextView)findViewById(R.id.tv_desc);

        if(getIntent()!=null)
        {
            Intent intent=getIntent();

            DataHolder data=intent.getParcelableExtra(Constants.PARCEL_LABEL);

            mimg.setImageResource(data.getImageId());
            mtitle.setText(data.getTitle());
            mdesc.setText(data.getDesc());
        }
    }
}
