package com.papersstudio.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        this.getSupportActionBar().hide();
        
        mainfunc();
    }

    private void mainfunc() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashscreen.this,signup_page.class));
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);
                finish();
            }
        },2000);

    }
}