package com.example.acer.tut55_77;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;
import android.widget.MediaController;


public class Video extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView video = (VideoView)findViewById(R.id.video);
        video.setVideoPath("https://www.youtube.com/watch?v=oF9yZenJtjI&list=PL6gx4Cwl9DGBsvRxJJOzG4r4k_zLKrnxl&index=55");
        MediaController mc = new MediaController(this);
        mc.setAnchorView(video);
        video.setMediaController(mc);
        video.start();

    }


}
