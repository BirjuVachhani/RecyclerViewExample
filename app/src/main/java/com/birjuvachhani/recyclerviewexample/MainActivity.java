package com.birjuvachhani.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private String []titles;
    private String []desc;
    private int []thumbs={R.drawable.thmb1,R.drawable.thmb2,R.drawable.thmb3,R.drawable.thmb4,R.drawable.thmb5,
            R.drawable.thmb6,R.drawable.thmb7,R.drawable.thmb8,R.drawable.thmb9,R.drawable.thmb10,
            R.drawable.thmb11,R.drawable.thmb12,R.drawable.thmb13,R.drawable.thmb14,R.drawable.thmb15,
            R.drawable.thmb16,R.drawable.thmb17,R.drawable.thmb18,R.drawable.thmb19,R.drawable.thmb20};

    private int []images={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
            R.drawable.img11,R.drawable.img12,R.drawable.img13,R.drawable.img14,R.drawable.img15,
            R.drawable.img16,R.drawable.img17,R.drawable.img18,R.drawable.img19,R.drawable.img20};

    private List<DataHolder> dataSet= Collections.emptyList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerView=(RecyclerView)findViewById(R.id.recycler_view);

        //getting resources from string.xml
        titles=getResources().getStringArray(R.array.titles);
        desc=getResources().getStringArray(R.array.descriptions);

        //creating data list
        dataSet=createList();

        //creating adapter for recycler view
        CustomAdapter adapter=new CustomAdapter(MainActivity.this,dataSet);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);


        mrecyclerView.setLayoutManager(layoutManager);
        mrecyclerView.setAdapter(adapter);
        mrecyclerView.addItemDecoration(dividerItemDecoration);


    }

    //fills data into list
    protected List<DataHolder> createList()
    {
        List<DataHolder> dataSet=new ArrayList<>();
        for(int i=0; i<titles.length && i<desc.length && i<images.length; i++)
        {
            DataHolder data=new DataHolder(images[i], thumbs[i], titles[i], desc[i]);
            dataSet.add(data);
        }
        return dataSet;
    }
}
