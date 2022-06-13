package com.deitel.app_kotliin_002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsuario = findViewById<EditText>(R.id.editTextUsuario);
        val editTextClave = findViewById<EditText>(R.id.editTextClave);

        val buttonIngresar = findViewById<Button>(R.id.buttonIngresar);

        buttonIngresar.setOnClickListener{ }
    }
}