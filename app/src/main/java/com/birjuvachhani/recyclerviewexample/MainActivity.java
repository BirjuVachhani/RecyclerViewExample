package com.birjuvachhani.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private String []titles;
    private String []desc;
    private int []images={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
            R.drawable.img11,R.drawable.img12,R.drawable.img13,R.drawable.img14,R.drawable.img15,
            R.drawable.img16,R.drawable.img17,R.drawable.img18,R.drawable.img19,R.drawable.img20};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerView=(RecyclerView)findViewById(R.id.recycler_view);

        //getting resources from string.xml
        titles=getResources().getStringArray(R.array.titles);
        desc=getResources().getStringArray(R.array.descriptions);
    }
}
