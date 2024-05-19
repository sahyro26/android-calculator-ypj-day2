package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Dapatkan value user input dari editText
        val num1 = binding.num1EditText.text
        val num2 = binding.num2EditText.text

        //Bila button + lakukan code didalam ini
        binding.plusBtn.setOnClickListener{
            val sum = num1.toString().toDouble() + num2.toString().toDouble()
            binding.resultTextView.text = "The sum of $num1 and $num2 is $sum"
        }
        //Bila button - lakukan code didalam ini
        binding.minustBtn.setOnClickListener {
            val sum = num1.toString().toDouble() - num2.toString().toDouble()
            binding.resultTextView.text = "The subtract of $num1 and $num2 is $sum"
        }
        //Bila button x lakukan code didalam ini
        binding.productBtn.setOnClickListener{
            val sum = num1.toString().toDouble() * num2.toString().toDouble()
            binding.resultTextView.text = "The product of $num1 and $num2 is $sum"
        }
        //Bila button / lakukan code didalam ini
        binding.divideBtn.setOnClickListener{
            val sum = num1.toString().toDouble() / num2.toString().toDouble()
            binding.resultTextView.text = "The division of $num1 and $num2 is $sum"
        }
    }
}