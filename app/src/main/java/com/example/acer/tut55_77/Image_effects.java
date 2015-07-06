package com.example.acer.tut55_77;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Bitmap;
import  android.os.Environment;
import  android.provider.MediaStore;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.content.ContextWrapper;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;


public class Image_effects extends ActionBarActivity {
    ImageView iv2;
    Drawable d1;
    Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_effects);
        iv2 =(ImageView)findViewById(R.id.iv1);
        //d1 = getResources().getDrawable(R.id.iv1);
        //bmp = ((BitmapDrawable d1)).getBitmap();
    }



}
