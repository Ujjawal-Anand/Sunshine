package com.example.android.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle extra = getIntent().getExtras();
        String weatherData = extra.getString("data");
        TextView textView = (TextView) findViewById(R.id.text_view1);
        textView.setText(weatherData);
    }
}
