package com.example.ubazar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubazar.databinding.FragmentDeliveryBinding;


public class DeliveryFragment extends Fragment {

    private FragmentDeliveryBinding binding;

    public DeliveryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDeliveryBinding.inflate(inflater, container, false);
        binding.deliverySkipBtn.setOnClickListener(view ->
                Navigation.findNavController(container).navigate(R.id.action_deliveryFragment_to_homeFragment));
        return binding.getRoot();
    }
}