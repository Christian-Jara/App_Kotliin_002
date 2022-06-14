package com.deitel.app_kotliin_002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.deitel.app_kotliin_002.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_segunda)

        val binding = ActivitySegundaBinding.inflate(layoutInflater);
        setContentView(binding.root);

        binding.buttonMostrar.setOnClickListener {
            val mensaje = binding.editTextMensaje.text.toString()

            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }

        binding.buttonSalir.setOnClickListener {
            finish()
            //val texto = "FISEI";
            //binding.editTextMensaje.setText(texto);
        }
    }
}