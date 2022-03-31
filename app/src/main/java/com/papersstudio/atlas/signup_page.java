package com.papersstudio.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

import com.papersstudio.atlas.databinding.ActivitySignupPageBinding;

public class signup_page extends AppCompatActivity {
    private ActivitySignupPageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignupPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.getSupportActionBar().hide();

        viewfuncs();
    }

    private void viewfuncs(){
        String text = "<font color=#707671>Have an account?</font> <font color=#47A36C>Log in</font>";
        binding.loginTxt.setText(Html.fromHtml(text));
    }
}