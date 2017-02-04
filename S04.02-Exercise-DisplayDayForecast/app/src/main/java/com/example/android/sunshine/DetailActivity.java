package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView weatherDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // DONE (2) Display the weather forecast that was passed from MainActivity
        String weatherData = null;
        if (getIntent().hasExtra("weather")) {
            weatherData = getIntent().getStringExtra("weather");
        }

        weatherDataTextView = (TextView) findViewById(R.id.tv_weather_data);

        if (weatherData != null) {
            weatherDataTextView.setText(weatherData);
        }
    }
}