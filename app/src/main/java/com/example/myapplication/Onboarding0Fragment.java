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

public class Onboarding0Fragment extends Fragment {

    Button botonSiguiente, botonSkip;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout correcto para este fragmento, asegúrate de que contiene los botones
        return inflater.inflate(R.layout.fragment_onboarding0, container, false);  // Asegúrate de que el layout tenga los botones
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        navController = Navigation.findNavController(view);

        botonSiguiente = view.findViewById(R.id.botonSiguiente);
        botonSkip = view.findViewById(R.id.botonSkip);

        // Verifica si los botones no son nulos para evitar NullPointerException
        if (botonSiguiente != null) {
            botonSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navega al siguiente fragmento (Onboarding1Fragment)
                    navController.navigate(R.id.action_onboarding0Fragment_to_onboarding1Fragment);
                }
            });
        } else {
            Log.e("Onboarding0Fragment", "Button botonSiguiente not found in layout");
        }


        if (botonSkip != null) {
            botonSkip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    navController.navigate(R.id.action_onboarding0Fragment_to_homeFragment);
                }
            });
        } else {
            Log.e("Onboarding0Fragment", "Button botonSkip not found in layout");
        }
    }
}
