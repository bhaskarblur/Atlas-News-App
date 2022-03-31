package com.papersstudio.atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

import com.papersstudio.atlas.databinding.ActivitySignupPageBinding;

public class signup_page extends AppCompatActivity {
    private ActivitySignupPageBinding binding;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    SharedPreferences saveprefs;
    SharedPreferences getprefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignupPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.getSupportActionBar().hide();
        saveprefs=this.getSharedPreferences("userlogged",0);
        getprefs=this.getSharedPreferences("userlogged",0);
        viewfuncs();
        uiEvent();
    }

    private void uiEvent() {
        binding.googleLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup_page.this, "Google Auth is currently unavailable.", Toast.LENGTH_SHORT).show();
            }
        });
        binding.facebookLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signup_page.this, "Facebook Auth is currently unavailable.", Toast.LENGTH_SHORT).show();
            }
        });
        binding.signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.name.getText().toString().isEmpty()){
                    binding.name.setError("Please enter your name");
                    Toast.makeText(signup_page.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else if(binding.email.getText().toString().isEmpty()){
                    binding.email.setError("Please enter your email address");
                    Toast.makeText(signup_page.this, "Please enter your email address", Toast.LENGTH_SHORT).show();
                }
                else if(!binding.email.getText().toString().trim().matches(emailPattern)){
                    binding.email.setError("Please enter a valid email address");
                    Toast.makeText(signup_page.this, "Please enter a valid email address", Toast.LENGTH_SHORT).show();
                }
                else if(binding.password.getText().toString().equals(null)){
                    binding.password.setError("Please enter your password");
                    Toast.makeText(signup_page.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                }

                else if(binding.password.getText().toString().length()<6){
                    binding.password.setError("Please enter a password of atleast 6 characters");
                    Toast.makeText(signup_page.this, "Please enter a password of atleast 6 characters", Toast.LENGTH_SHORT).show();
                }
                else{
                    binding.progressBar.setVisibility(View.VISIBLE);
                    binding.signupBtn.setVisibility(View.INVISIBLE);
                    SharedPreferences.Editor editor=saveprefs.edit();
                    editor.putString("username",binding.nameField.getEditText().toString());
                    editor.putString("email",binding.emailField.getEditText().toString().trim());
                    Toast.makeText(signup_page.this, "Account Created", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void viewfuncs(){
        String text = "<font color=#707671>Have an account?</font> <font color=#47A36C>Log in</font>";
        binding.loginTxt.setText(Html.fromHtml(text));

    }
}