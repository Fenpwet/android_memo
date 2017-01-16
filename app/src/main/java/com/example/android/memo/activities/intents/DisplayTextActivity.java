package com.example.android.memo.activities.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.memo.activities.MainActivity;
import com.example.android.memo.activities.R;

public class DisplayTextActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text);
        init();

        textView.setText(getIntent().getStringExtra(MainActivity.DISPLAY_TEXT_ACTIVITY_EXTRA));
    }

    private void init() {
        textView = (TextView) findViewById(R.id.display_text_activity_text_view);
    }
}
