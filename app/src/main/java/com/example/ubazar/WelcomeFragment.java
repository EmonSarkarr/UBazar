package com.example.ubazar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubazar.databinding.FragmentWelcomeBinding;


public class WelcomeFragment extends Fragment {

    private FragmentWelcomeBinding binding;

    public WelcomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentWelcomeBinding.inflate(inflater, container, false);

        binding.welcomeSkipBtn.setOnClickListener(view ->
                        Navigation.findNavController(container).navigate(R.id.action_welcomeFragment_to_homeFragment));
        return binding.getRoot();
    }
}