package com.applications.arunjotsingh.myapplication;

/**
 * Created by arunjotsingh on 2/16/16.
 */
import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class SetWallpaper extends Activity {

    ImageView iv;
    WallpaperManager wm;
    Bitmap bmp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_wallpaper);
        iv=(ImageView)findViewById(R.id.img);
        int id=getIntent().getIntExtra("id",R.drawable.sample_1);
        iv.setImageResource(id);
        bmp=BitmapFactory.decodeResource(getResources(),id);
        wm=WallpaperManager.getInstance(this);

    }
    public void setWallpaper(View v)
    {
        System.out.println("HELLO WORLD");
        try {
            wm.setBitmap(bmp);
            Toast.makeText(getApplicationContext(),"Wallpaper Set",Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}