package com.example.android.memo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.android.memo.activities.intents.DisplayTextActivity;
import com.example.android.memo.activities.layouts.LinearLayoutActivity;
import com.example.android.memo.activities.layouts.RelativeLayoutActivity;

public class MainActivity extends AppCompatActivity {

    public static final String DISPLAY_TEXT_ACTIVITY_EXTRA = "extra";

    private EditText displayTextActivityEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        displayTextActivityEditText = (EditText) findViewById(R.id.main_display_activity_edit_text);
    }

    public void toLinearLayouts(View view) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        startActivity(intent);
    }

    public void toRelativeLayouts(View view) {
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);
    }

    public void toDisplayTextActivity(View view) {
        Intent intent = new Intent(this, DisplayTextActivity.class);
        intent.putExtra(DISPLAY_TEXT_ACTIVITY_EXTRA, displayTextActivityEditText.getText().toString());
        startActivity(intent);
    }
}
