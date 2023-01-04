package com.example.ubazar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubazar.databinding.FragmentBestGroceryBinding;
import com.example.ubazar.databinding.FragmentWelcomeBinding;


public class BestGroceryFragment extends Fragment {

    private FragmentBestGroceryBinding binding;

    public BestGroceryFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentBestGroceryBinding.inflate(inflater, container, false);
        binding.grocerySkipBtn.setOnClickListener(view ->
                Navigation.findNavController(container).navigate(R.id.action_bestGroceryFragment_to_homeFragment));
        return binding.getRoot();

          }
}