package com.example.ubazar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubazar.databinding.FragmentCategoryBinding;


public class CategoryFragment extends Fragment {

    private FragmentCategoryBinding binding;

    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCategoryBinding.inflate(inflater,container,false);

    //    replaceFragment(new HomeFFragment());
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.homeAction:
                  //  replaceFragment(new HomeFFragment());
                    break;
                case R.id.cartAction:
                   // replaceFragment(new CartFragment());
                    break;
                case R.id.favoriteAction:
                    //replaceFragment(new FavoriteFragment());
                    break;
                case R.id.meAction:
                    //replaceFragment(new ProfileFragment());
                    break;


            }


            return true;
        });
        return binding.getRoot();
    }
    FragmentManager fragmentManager = getParentFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
      //  fragmentTransaction.replace(R.id.frame_layout,fragment);
       // fragmentTransaction.commit();
}