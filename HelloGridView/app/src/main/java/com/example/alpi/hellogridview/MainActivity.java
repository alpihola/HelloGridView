package com.example.alpi.hellogridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instancia de GridView
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        //método set.adapter para mostrar imagenes
        gridview.setAdapter(new ImageAdapter(this));

       // GridView gridview2 = (GridView) findViewById(R.id.gridview2);
       // gridview2.setAdapter(new ImageAdapter(this));

        //Método click al presionar un elemento
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
