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

public class Onboarding1Fragment extends Fragment {

    Button botonSiguiente, botonSkip;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the correct layout for this fragment, assuming 'fragment_onboarding1'
        return inflater.inflate(R.layout.fragment_onboarding1, container, false);  // Ensure this layout contains botonSiguiente and botonSkip
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize the NavController for navigation
        navController = Navigation.findNavController(view);

        // Ensure both buttons are correctly initialized
        botonSiguiente = view.findViewById(R.id.botonSiguiente);
        botonSkip = view.findViewById(R.id.botonSkip);

        // Check if the buttons are not null to avoid NullPointerException
        if (botonSiguiente != null) {
            botonSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navigate to the next fragment (Onboarding2Fragment)
                    navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment);
                }
            });
        } else {
            Log.e("Onboarding1Fragment", "Button botonSiguiente not found in layout");
        }

        // Optionally set up the skip button
        if (botonSkip != null) {
            botonSkip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Define behavior for the skip button, e.g., navigating directly to HomeFragment
                    navController.navigate(R.id.action_onboarding1Fragment_to_homeFragment);
                }
            });
        } else {
            Log.e("Onboarding1Fragment", "Button botonSkip not found in layout");
        }
    }
}



