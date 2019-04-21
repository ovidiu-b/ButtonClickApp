package com.example.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            textView?.append(userInput.text)
            textView?.append("\n")

            userInput.text.clear()
        }
    }
}
