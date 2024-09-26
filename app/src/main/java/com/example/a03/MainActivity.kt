package com.example.a03

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências para os elementos da interface
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val verifyButton = findViewById<Button>(R.id.verifyButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        // Senha fixa para verificação
        val correctPassword = "1234"

        verifyButton.setOnClickListener {
            val enteredPassword = passwordInput.text.toString()

            // Verificação da senha
            if (enteredPassword == correctPassword) {
                resultText.text = "Senha correta"
            } else {
                resultText.text = "Senha incorreta"
            }
        }
    }
}
