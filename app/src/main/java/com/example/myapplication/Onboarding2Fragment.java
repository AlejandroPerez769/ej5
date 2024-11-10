package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Onboarding2Fragment extends Fragment {

    Button botonFinalizar;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the correct layout
        return inflater.inflate(R.layout.fragment_onboarding2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize the NavController for navigation
        navController = Navigation.findNavController(view);

        // Find the button in the inflated view
        botonFinalizar = view.findViewById(R.id.botonFinalizar);

        // Check if the button is null
        if (botonFinalizar != null) {
            // Set an OnClickListener on the button
            botonFinalizar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navigate to the home fragment
                    navController.navigate(R.id.action_onboarding2Fragment_to_homeFragment);
                }
            });
        } else {
            // Log error if the button is not found in the layout
            Log.e("Onboarding2Fragment", "Button botonFinalizar not found in layout");
        }
    }
}
