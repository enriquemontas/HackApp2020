package com.example.hackapp2020.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hackapp2020.R;
import com.example.hackapp2020.databinding.ActivityMainBinding;
import com.example.hackapp2020.databinding.ActivityProfileBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityProfileBinding binding = ActivityProfileBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        final FloatingActionButton foaLeft = binding.left;

        foaLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}