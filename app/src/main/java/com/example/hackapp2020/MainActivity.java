package com.example.hackapp2020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.hackapp2020.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        final BottomNavigationView bottomNavigation = binding.bottomNavigation;

        final FragmentManager fragmentManager = getSupportFragmentManager();

        // define fragments
//        final Fragment fragment1 = new Fragment();
//        final Fragment fragment2 = new Fragment();
//        final Fragment fragment3 = new Fragment();

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                switch (menuItem.getItemId()) {
                    case R.id.action_map:
                        Toast.makeText(MainActivity.this,"HOME!", Toast.LENGTH_SHORT).show();
//                        fragment = fragment1;
                        break;
                    case R.id.action_leaderboard:
                        Toast.makeText(MainActivity.this,"LEADERBOARD!", Toast.LENGTH_SHORT).show();
//                        fragment = fragment2;
                        break;
                    case R.id.action_profile:
                    default:
                        Toast.makeText(MainActivity.this,"PROFILE!", Toast.LENGTH_SHORT).show();
//                        fragment = fragment3;
                        break;
                }
//                fragmentManager.beginTransaction().replace(R.id.fragContainer, fragment).commit();
                return true;
            }
        });
        // Set default selection
        bottomNavigation.setSelectedItemId(R.id.action_map);
    }
}