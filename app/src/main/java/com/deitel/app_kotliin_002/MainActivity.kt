package com.deitel.app_kotliin_002

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsuario = findViewById<EditText>(R.id.editTextUsuario);
        val editTextClave = findViewById<EditText>(R.id.editTextClave);
        val usuario = editTextUsuario.text.toString();
        val clave = editTextClave.text.toString();

        val buttonIngresar = findViewById<Button>(R.id.buttonIngresar);

        buttonIngresar.setOnClickListener{
            if((usuario.equals("admin")) && (clave.equals("admin"))){
                val intent = Intent(this, SegundaActivity::class.java);
                startActivity(intent);
            } else{
                Toast.makeText(this, "Datos erroneos", Toast.LENGTH_LONG).show();
            }
        }





    }
}