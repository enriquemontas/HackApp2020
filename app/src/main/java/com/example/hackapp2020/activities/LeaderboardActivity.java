package com.example.hackapp2020.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hackapp2020.R;
import com.example.hackapp2020.databinding.ActivityLeaderboardBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LeaderboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityLeaderboardBinding binding = ActivityLeaderboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        final FloatingActionButton foaRight = binding.right;

        foaRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LeaderboardActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}