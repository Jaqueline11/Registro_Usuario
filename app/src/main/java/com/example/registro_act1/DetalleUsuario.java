package com.example.registro_act1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.registro_act1.databinding.ActivityDetalleUsuarioBinding;

public class DetalleUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetalleUsuarioBinding binding= ActivityDetalleUsuarioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        binding.txtUsuario.setText(nombre);
    }
}