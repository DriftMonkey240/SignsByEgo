package com.example.a02craiggray.signsbyego;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[] {R.drawable.picture_1, R.drawable.picture_2, R.drawable.picture_3, R.drawable.picture_4, R.drawable.picture_5, R.drawable.picture_6, R.drawable.picture_7, R.drawable.picture_8, R.drawable.picture_9, R.drawable.picture_10, R.drawable.picture_11, R.drawable.picture_12, R.drawable.picture_13, R.drawable.picture_14, R.drawable.picture_15, R.drawable.picture_16};

    ImageAdapter (Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}

