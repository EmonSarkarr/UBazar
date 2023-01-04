package com.example.ubazar;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubazar.databinding.FragmentSplashScreenBinding;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenFragment extends Fragment {
    private Timer mTimer;
    private TimerTask mTimerTask;
    private FragmentSplashScreenBinding binding;

    public SplashScreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        binding = FragmentSplashScreenBinding.inflate(inflater,container,false);

       View layout = inflater.inflate(R.layout.fragment_splash_screen, container, false);
     ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        return binding.getRoot();

    }
}