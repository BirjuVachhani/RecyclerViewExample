package com.birjuvachhani.recyclerviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailedActivity extends AppCompatActivity {

    @BindView(R.id.iv_img) ImageView mimg;
    @BindView(R.id.tv_title) TextView mtitle;
    @BindView(R.id.tv_desc) TextView mdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        ButterKnife.bind(this);

        if(getIntent()!=null)
        {
            Intent intent=getIntent();

            int imageId=intent.getIntExtra(Constants.IMAGE_LABEL,0);
            String title=intent.getStringExtra(Constants.TITLE_LABEL);
            String desc=intent.getStringExtra(Constants.DESC_LABEL);

            mimg.setImageResource(imageId);
            mtitle.setText(title);
            mdesc.setText(desc);
        }
    }
}
