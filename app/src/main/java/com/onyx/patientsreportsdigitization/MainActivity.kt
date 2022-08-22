package com.onyx.patientsreportsdigitization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signup()
    }

    private fun signup() {

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            var email = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            var password = findViewById<EditText>(R.id.editTextTextPassword).text.toString()

            var auth = Firebase.auth
            auth.createUserWithEmailAndPassword(email,password);
            Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show()

        }


    }
}