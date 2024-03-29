package com.example.tabiin;

import static com.example.tabiin.util.UtilFragment.changeFragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;

import com.example.tabiin.databinding.*;
import com.example.tabiin.ui.about_app.AppAboutFragment;
import com.example.tabiin.ui.fard.*;
import com.example.tabiin.ui.kitab.*;
import com.example.tabiin.ui.useful.*;
import com.example.tabiin.ui.zickr.*;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {

                case R.id.kitab_general:
                    changeFragment(this,
                            new GeneralKitabihilFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

                case R.id.fard_general:
                    changeFragment(this,
                            new GeneralFardFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

                case R.id.zickr_general:
                    changeFragment(this,
                            new GeneralZickrFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

                case R.id.news_general:
                    changeFragment(this,
                            new GeneralUsefulFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

                case R.id.about_app:
                    changeFragment(this,
                            new AppAboutFragment(),
                            R.id.kontainerFragment,
                            savedInstanceState);

                    break;

            }

            return true;


        });
    }

}


