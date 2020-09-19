package com.example.hackapp2020.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hackapp2020.R;
import com.example.hackapp2020.databinding.FragmentLeaderboardBinding;
import com.example.hackapp2020.databinding.FragmentMapBinding;

/**
 * A simple {@link Fragment} subclass.
 *
 * create an instance of this fragment.
 */
public class LeaderboardFragment extends Fragment {

    private FragmentLeaderboardBinding binding;

    public LeaderboardFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLeaderboardBinding.inflate(getLayoutInflater());
        final View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}