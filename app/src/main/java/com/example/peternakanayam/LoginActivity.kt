package com.example.peternakanayam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Here you can add authentication logic
            // If login is successful, navigate to MainActivity
            if (isValidLogin(username, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Optional: Close the LoginActivity so the user can't navigate back to it
            } else {
                // Handle invalid login
            }
        }

        val googleLoginButton = findViewById<ImageButton>(R.id.googleLogin)
        googleLoginButton.setOnClickListener {
            // Handle Google login logic here
        }

        val facebookLoginButton = findViewById<ImageButton>(R.id.facebookLogin)
        facebookLoginButton.setOnClickListener {
            // Handle Facebook login logic here
        }

        val instagramLoginButton = findViewById<ImageButton>(R.id.instagramLogin)
        instagramLoginButton.setOnClickListener {
            // Handle Instagram login logic here
        }

        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun isValidLogin(username: String, password: String): Boolean {
        // Replace with actual login logic
        return username == "user" && password == "password"
    }
}
