package com.applications.arunjotsingh.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;

public class MainActivity extends Activity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      GridView gridview = (GridView) findViewById(R.id.gridview);
      gridview.setAdapter(new ImageAdapter(this));
   }

}