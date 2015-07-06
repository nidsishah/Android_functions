package com.example.acer.tut55_77;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.content.pm.PackageInfo;
import  android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.Button;



public class camera extends ActionBarActivity {
    static final int REQUEST_IMAGE_CAPTURE =1;
    ImageView iv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        iv = (ImageView)findViewById(R.id.imageView);
        Button b =(Button)findViewById(R.id.btn_camera);
        if(!hasCamera())
        {
            b.setEnabled(false);
        }

    }
    public Boolean hasCamera()
    {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }
    public void camera_on()
    {
        Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(in,REQUEST_IMAGE_CAPTURE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_IMAGE_CAPTURE&& resultCode==RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap bm = (Bitmap)extras.get("data");
            iv.setImageBitmap(bm);
        }
    }
}
