package com.example.fajar.belajarlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView title, detailBawah;
    ImageView picture;
    Intent intent;
    int linkDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = (TextView) findViewById(R.id.titleDetail);
        detailBawah = (TextView) findViewById(R.id.detailDetail);
        picture = (ImageView) findViewById(R.id.pictureDetail);


        intent = getIntent();

        title.setText(""+intent.getStringExtra("title"));
        detailBawah.setText(""+intent.getStringExtra("detail"));
        linkDrawable = intent.getIntExtra("picture",R.drawable.coba);
        picture.setImageResource(linkDrawable);

    }

}