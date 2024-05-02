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


public class fragment_nine extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nine, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnFragment9 = view.findViewById(R.id.btn_informacion);
        Button btnFragment9b = view.findViewById(R.id.btn_mis_tarjetas);
        Button btnFragment9c = view.findViewById(R.id.btn_opciones);
        Button btnFragment9d = view.findViewById(R.id.btn_help_center);

        btnFragment9.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragment_nine_to_fragmentOne);
        });
        btnFragment9b.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragment_nine_to_fragmentOne);
        });
        btnFragment9c.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragment_nine_to_fragmentOne);
        });
        btnFragment9d.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragment_nine_to_fragmentOne);
        });
    }
}