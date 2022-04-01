package com.papersstudio.atlas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.papersstudio.atlas.databinding.ActivityHomeBinding;
import com.squareup.picasso.Picasso;

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
                Picasso.get().load(R.drawable.home_selected_icon).into(binding.homeIcon);
                binding.homeTxt.setTextColor(Color.parseColor("#47A36C"));

                Picasso.get().load(R.drawable.trending_icon).into(binding.trendingIcon);
                binding.trendingTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.bookmark_icon).into(binding.savedIcon);
                binding.savedTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.profile_icon).into(binding.profileIcon);
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
                Picasso.get().load(R.drawable.homeicon).into(binding.homeIcon);
                binding.homeTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.trending_selected_icon).into(binding.trendingIcon);
                binding.trendingTxt.setTextColor(Color.parseColor("#47A36C"));

                Picasso.get().load(R.drawable.bookmark_icon).into(binding.savedIcon);
                binding.savedTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.profile_icon).into(binding.profileIcon);
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
                Picasso.get().load(R.drawable.homeicon).into(binding.homeIcon);
                binding.homeTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.trending_icon).into(binding.trendingIcon);
                binding.trendingTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.save_selected_icon).into(binding.savedIcon);
                binding.savedTxt.setTextColor(Color.parseColor("#47A36C"));

                Picasso.get().load(R.drawable.profile_icon).into(binding.profileIcon);
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
                Picasso.get().load(R.drawable.homeicon).into(binding.homeIcon);
                binding.homeTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.trending_icon).into(binding.trendingIcon);
                binding.trendingTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.bookmark_icon).into(binding.savedIcon);
                binding.savedTxt.setTextColor(Color.parseColor("#9BA79E"));

                Picasso.get().load(R.drawable.profile_selected_icon).into(binding.profileIcon);
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