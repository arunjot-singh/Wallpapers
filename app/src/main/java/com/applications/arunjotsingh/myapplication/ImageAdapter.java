package com.applications.arunjotsingh.myapplication;

/**
 * Created by arunjotsingh on 2/14/16.
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(4, 4, 4, 4);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.sample_2,  R.drawable.sample_24,
            R.drawable.sample_13,
            R.drawable.sample_6,
            R.drawable.sample_1,  R.drawable.sample_15,
            R.drawable.sample_12, R.drawable.sample_16,
            R.drawable.sample_5,  R.drawable.sample_17,
            R.drawable.sample_7,  R.drawable.sample_18,
            R.drawable.sample_3,  R.drawable.sample_19,
            R.drawable.sample_8,  R.drawable.sample_11,
            R.drawable.sample_9,  R.drawable.sample_20,
            R.drawable.sample_10, R.drawable.sample_4
    };
}