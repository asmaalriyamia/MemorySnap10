package com.example.alzakwani.memorysnap.user_home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.alzakwani.memorysnap.R;

/**
 * Created by Dell on 12/16/2017.
 */

public class ImageAdapter extends BaseAdapter {
   private Context mContext;

   public Integer[] mThumIds;

    public ImageAdapter(Context c) {
        mContext = c;
        mThumIds = new Integer[]{
                R.drawable.fasion,
                R.drawable.birthday,
                R.drawable.wedding,
                R.drawable.graduation,
                R.drawable.personal,
                R.drawable.product
        };
    }

    @Override
    public int getCount() {
        return mThumIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int postion, View view, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumIds[postion]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
        return imageView;
    }
}
