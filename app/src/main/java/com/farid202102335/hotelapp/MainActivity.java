package com.farid202102335.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQAO4W5MuMCjl-c2GuT1ioAj80Y4fDsXOKil7id6JH&s";
                Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}