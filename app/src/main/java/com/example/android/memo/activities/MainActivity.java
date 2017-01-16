package com.example.android.memo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.memo.activities.layouts.LinearLayoutActivity;
import com.example.android.memo.activities.layouts.RelativeLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLinearLayouts(View view) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void toRelativeLayouts(View view) {
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);
    }
}
