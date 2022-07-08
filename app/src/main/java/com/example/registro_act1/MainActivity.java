package com.example.registro_act1;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.registro_act1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegistrar.setOnClickListener(view -> {
            String nombre = binding.txtNombre.getText().toString();
            String clave = binding.txtClave.getText().toString();
            String clave1 = binding.txtClave2.getText().toString();
            if (!nombre.isEmpty() && !clave.isEmpty() &&
                    !clave1.isEmpty()){
                if (clave.length()>4){
                    if (clave1.equals(clave)){
                        Toast.makeText(getApplicationContext(),"Registrado correctamente", Toast.LENGTH_SHORT).show();
                        abrirActivityDetalle(nombre);
                    }else{
                        Toast.makeText(getApplicationContext(),"Las claves no coinciden", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Clave minimo 5 caracteres", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(getApplicationContext(),"Llenar todos los campos", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void registrar(){

    }
    private void abrirActivityDetalle(String nom){
        /*Intent = Abrir una nueva ventana*/
        Intent intent = new Intent(this,DetalleUsuario.class);
        intent.putExtra("nombre",nom);
        startActivity(intent);
    }

}