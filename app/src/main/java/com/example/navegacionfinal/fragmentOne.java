package com.example.navegacionfinal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class fragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    //    Button btnFragment1 = view.findViewById(R.id.buttonOneNav);
        ImageView imageViewLogo = view.findViewById(R.id.logo);
        imageViewLogo.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentOne_to_fragmentTwo);
        });


    }
}