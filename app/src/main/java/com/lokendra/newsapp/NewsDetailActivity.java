package com.lokendra.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewsDetailActivity extends AppCompatActivity {
    String title, desc, content, imageURL,url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        title = getIntent().getStringExtra("title");
        title = getIntent().getStringExtra("content");
        title = getIntent().getStringExtra("desc");
        title = getIntent().getStringExtra("image");
        title = getIntent().getStringExtra("url");


    }
}