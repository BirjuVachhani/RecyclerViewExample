package com.birjuvachhani.recyclerviewexample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.birjuvachhani.recyclerviewexample.databinding.DetailedActivityBinding;

public class DetailedActivity extends AppCompatActivity {

    private DetailedActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_detailed);

        if(getIntent()!=null)
        {
            Intent intent=getIntent();
            DataHolder data=intent.getParcelableExtra(Constants.PARCEL_LABEL);
            binding.setDataholder(data);
            binding.executePendingBindings();
        }
    }
}
