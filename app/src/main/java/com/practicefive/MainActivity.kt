package com.practicefive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.widget.addTextChangedListener
import com.practicefive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.button2.visibility = View.INVISIBLE
            binding.textView.text = "Show btnTwo"
        }
        binding.button2.setOnClickListener {
            binding.button.visibility = View.INVISIBLE
            binding.textView.text = "Show btnOne"
        }
        binding.textView.setOnClickListener {
            binding.button.visibility = View.VISIBLE
            binding.button2.visibility = View.VISIBLE
        }
        binding.editTextTextPersonName.addTextChangedListener {
        binding.textView2.text= binding.editTextTextPersonName.text
        binding.textView2.visibility = View.VISIBLE
        }
        binding.editTextTextPersonName.setOnFocusChangeListener { view, b -> binding.button
            binding.textView.text= "Focus Changed"}
    }

}