package com.example.fedunimillionaire30345282.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fedunimillionaire30345282.Activities.HomeActivity;
import com.example.fedunimillionaire30345282.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.game).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.game:
                startActivity(new Intent(this, HomeActivity.class));
                break;
        }
    }
}