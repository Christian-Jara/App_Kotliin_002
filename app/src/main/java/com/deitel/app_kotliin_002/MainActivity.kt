package com.deitel.app_kotliin_002

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.deitel.app_kotliin_002.databinding.ActivityMainBinding
import com.deitel.app_kotliin_002.databinding.ActivitySegundaBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        /*
        val editTextUsuario = findViewById<EditText>(R.id.editTextUsuario);
        val editTextClave = findViewById<EditText>(R.id.editTextClave);
        val usuario = editTextUsuario.text.toString();
        val clave = editTextClave.text.toString();

        val buttonIngresar = findViewById<Button>(R.id.buttonIngresar);

        buttonIngresar.setOnClickListener{
            if(usuario == "" && clave == ""){
                val intent = Intent(this, SegundaActivity::class.java);
                startActivity(intent);
            } else{
                Toast.makeText(this, "Datos erroneos", Toast.LENGTH_LONG).show();
            }
        }
        */

        val binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        val usuario = binding.editTextUsuario.text.toString()
        val clave = binding.editTextClave.text.toString()


        binding.buttonIngresar.setOnClickListener {
            /*if(usuario == "admin" && clave == "admin"){

            }else{
                Toast.makeText(this, "Datos erroneos", Toast.LENGTH_LONG).show();
            }*/
        }

    }
}