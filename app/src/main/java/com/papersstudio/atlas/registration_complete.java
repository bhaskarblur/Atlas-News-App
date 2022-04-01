package com.papersstudio.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.papersstudio.atlas.databinding.ActivityRegistrationCompleteBinding;

public class registration_complete extends AppCompatActivity {
    private ActivityRegistrationCompleteBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegistrationCompleteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.getSupportActionBar().hide();

        uiEvents();
    }

    private void uiEvents() {
        binding.continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}