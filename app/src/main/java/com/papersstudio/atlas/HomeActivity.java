package com.papersstudio.atlas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.papersstudio.atlas.databinding.ActivityHomeBinding;
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        this.getSupportActionBar().hide();

        manageNavBar();
    }

    private void manageNavBar() {
        binding.homelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Picasso.get().load(R.drawable.ic_homeselected).into(binding.homeIcon);
                binding.homeIcon.setImageResource(R.drawable.ic_homeselected);
                binding.homeTxt.setTextColor(Color.parseColor("#47A36C"));

                //Picasso.get().load(R.drawable.ic_trending).into(binding.trendingIcon);
                binding.trendingIcon.setImageResource(R.drawable.ic_trending);
                binding.trendingTxt.setTextColor(Color.parseColor("#9BA79E"));

               // Picasso.get().load(R.drawable.ic_bookmark).into(binding.savedIcon);
                binding.savedIcon.setImageResource(R.drawable.ic_bookmark);
                binding.savedTxt.setTextColor(Color.parseColor("#9BA79E"));

               // Picasso.get().load(R.drawable.ic_profile).into(binding.profileIcon);
                binding.profileIcon.setImageResource(R.drawable.ic_profile);
                binding.profileTxt.setTextColor(Color.parseColor("#9BA79E"));

                homeFragment homeFragment=new homeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(R.anim.fade_2, R.anim.fade);
                transaction.replace(R.id.mainFragment, homeFragment);
                transaction.commit();

            }
        });

        binding.trendinglayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.homeIcon.setImageResource(R.drawable.ic_home);
                binding.homeTxt.setTextColor(Color.parseColor("#9BA79E"));

                binding.trendingIcon.setImageResource(R.drawable.ic_trendingselected);
                binding.trendingTxt.setTextColor(Color.parseColor("#47A36C"));

                binding.savedIcon.setImageResource(R.drawable.ic_bookmark);
                binding.savedTxt.setTextColor(Color.parseColor("#9BA79E"));

                binding.profileIcon.setImageResource(R.drawable.ic_profile);
                binding.profileTxt.setTextColor(Color.parseColor("#9BA79E"));

                homeFragment homeFragment=new homeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(R.anim.fade_2, R.anim.fade);
                transaction.replace(R.id.mainFragment, homeFragment);
                transaction.commit();
            }
        });

        binding.savedlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.homeIcon.setImageResource(R.drawable.ic_home);
                binding.homeTxt.setTextColor(Color.parseColor("#9BA79E"));

                binding.trendingIcon.setImageResource(R.drawable.ic_trending);
                binding.trendingTxt.setTextColor(Color.parseColor("#9BA79E"));

                binding.savedIcon.setImageResource(R.drawable.ic_bookmarkselected);
                binding.savedTxt.setTextColor(Color.parseColor("#47A36C"));

                binding.profileIcon.setImageResource(R.drawable.ic_profile);
                binding.profileTxt.setTextColor(Color.parseColor("#9BA79E"));

                homeFragment homeFragment=new homeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(R.anim.fade_2, R.anim.fade);
                transaction.replace(R.id.mainFragment, homeFragment);
                transaction.commit();
            }
        });

        binding.profilelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.homeIcon.setImageResource(R.drawable.ic_home);
                binding.homeTxt.setTextColor(Color.parseColor("#9BA79E"));


                binding.trendingIcon.setImageResource(R.drawable.ic_trending);
                binding.trendingTxt.setTextColor(Color.parseColor("#9BA79E"));

                binding.savedIcon.setImageResource(R.drawable.ic_bookmark);
                binding.savedTxt.setTextColor(Color.parseColor("#9BA79E"));

                binding.profileIcon.setImageResource(R.drawable.ic_profileselected);
                binding.profileTxt.setTextColor(Color.parseColor("#47A36C"));

                homeFragment homeFragment=new homeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(R.anim.fade_2, R.anim.fade);
                transaction.replace(R.id.mainFragment, homeFragment);
                transaction.commit();
            }
        });
    }

}