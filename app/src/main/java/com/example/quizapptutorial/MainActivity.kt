package com.example.quizapptutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton: Button = findViewById(R.id.btn_start)
        val nameEditText: AppCompatEditText = findViewById(R.id.et_name)

        buttonStart.setOnClickListener {
            etName.text?.let {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, it.toString())
                startActivity(intent)
                finish()
            } ?: Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
        }
    }
}
