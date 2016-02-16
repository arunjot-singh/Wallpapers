package com.applications.arunjotsingh.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   GridView gv;
   ArrayList<ImageGallery> als=new ArrayList<>();
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      gv=(GridView)findViewById(R.id.gridview);
      als.add(new ImageGallery(R.drawable.sample_1)); // Add Different Images Here
      als.add(new ImageGallery(R.drawable.sample_10)); // Add Different Images Here
      als.add(new ImageGallery(R.drawable.sample_11)); // Add Different Images Here
      als.add(new ImageGallery(R.drawable.sample_12)); // Add Different Images Here
      als.add(new ImageGallery(R.drawable.sample_13)); // Add Different Images Here
      als.add(new ImageGallery(R.drawable.sample_15)); // Add Different Images Here
      als.add(new ImageGallery(R.drawable.sample_16)); // Add Different Images Here
      als.add(new ImageGallery(R.drawable.sample_17)); // Add Different Images Here
      
      GridAdapter adapter=new GridAdapter(als);
      gv.setAdapter(adapter);
      gv.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
         {
            Intent in=new Intent(getApplicationContext(),SetWallpaper.class);
            in.putExtra("id",als.get(i).getImageId());
            startActivity(in);
         }
      });
   }
   class ImageGallery
   {
      private int img_id;
      public ImageGallery(int id)
      {
         img_id=id;
      }
      public int getImageId()
      {
         return img_id;
      }
   }
   class GridAdapter extends BaseAdapter
   {
      ArrayList<ImageGallery> als;

      public GridAdapter(ArrayList<ImageGallery> als)
      {
         this.als=als;
      }

      @Override
      public int getCount()
      {
         return als.size();
      }

      @Override
      public Object getItem(int i)
      {
         return als.get(i);
      }

      @Override
      public long getItemId(int i)
      {
         return i*20+78;
      }

      @Override
      public View getView(int i, View convertView, ViewGroup parent)
      {
         LayoutInflater inflater=LayoutInflater.from(parent.getContext());
         convertView=inflater.inflate(R.layout.grid_layout, parent, false);
         ImageView iv=(ImageView)(convertView.findViewById(R.id.iv));
         ImageGallery ap=als.get(i);
         iv.setImageResource(ap.getImageId());
         return convertView;
      }
   }

}

