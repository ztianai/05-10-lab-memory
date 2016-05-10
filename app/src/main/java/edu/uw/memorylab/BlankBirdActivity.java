package edu.uw.memorylab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BlankBirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank_bird);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
