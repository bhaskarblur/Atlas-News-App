package com.papersstudio.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Toast;

import com.papersstudio.atlas.databinding.ActivityLoginPageBinding;
import com.papersstudio.atlas.databinding.ActivitySignupPageBinding;

public class login_page extends AppCompatActivity {
    private ActivityLoginPageBinding binding;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    SharedPreferences saveprefs;
    SharedPreferences getprefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.getSupportActionBar().hide();
        saveprefs=this.getSharedPreferences("userlogged",0);
        getprefs=this.getSharedPreferences("userlogged",0);
        viewfuncs();
        uiEvent();
    }

    private void uiEvent() {
        binding.signinTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login_page.this,signup_page.class));
                finish();
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
            }
        });
        binding.googleLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_page.this, "Google Auth is currently unavailable.", Toast.LENGTH_SHORT).show();
            }
        });
        binding.facebookLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_page.this, "Facebook Auth is currently unavailable.", Toast.LENGTH_SHORT).show();
            }
        });
        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(binding.email.getText().toString().isEmpty()){
                    binding.email.setError("Please enter your email address");
                    Toast.makeText(login_page.this, "Please enter your email address", Toast.LENGTH_SHORT).show();
                }
                else if(!binding.email.getText().toString().trim().matches(emailPattern)){
                    binding.email.setError("Please enter a valid email address");
                    Toast.makeText(login_page.this, "Please enter a valid email address", Toast.LENGTH_SHORT).show();
                }
                else if(binding.password.getText().toString().equals(null)){
                    binding.password.setError("Please enter your password");
                    Toast.makeText(login_page.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                }

                else{
                    binding.progressBar.setVisibility(View.VISIBLE);
                    binding.loginBtn.setVisibility(View.INVISIBLE);
                    SharedPreferences.Editor editor=saveprefs.edit();
                    editor.putString("logged","yes");
                   // editor.putString("username",binding.name.getText().toString());
                    editor.putString("email",binding.email.getText().toString().trim());
                    editor.commit();
                    Toast.makeText(login_page.this, "Welcome back!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void viewfuncs(){
        String logged=getprefs.getString("logged","no");
        if(logged.equals("yes")) {
            //continue to home page
        }
        String text = "<font color=#707671>New to Atlas?</font> <font color=#47A36C>Sign up</font>";
        binding.signinTxt.setText(Html.fromHtml(text));
        SpannableString content = new SpannableString("Need help logging?");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        binding.loginhelpTxt.setText(content);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
    }
}