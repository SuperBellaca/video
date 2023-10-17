package com.databit.actividad2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView miVideo = findViewById(R.id.videoLol);

        String videop="android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri =Uri.parse(videop);
        miVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        miVideo.setMediaController(mediaController);
        mediaController.setAnchorView(miVideo);
    }
}