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


public class fragmentFive extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_five, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnFragment5 = view.findViewById(R.id.btn_enviar_dinero);
        Button btnFragment5b = view.findViewById(R.id.btn_ingreso_dinero);

        btnFragment5.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentFive_to_fragmentSix);
        });
        btnFragment5b.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentFive_to_fragmentSix);
        });
    }

}