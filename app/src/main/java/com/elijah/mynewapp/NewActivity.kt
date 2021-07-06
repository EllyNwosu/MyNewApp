package com.elijah.mynewapp

import android.os.Bundle

class NewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPropertyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imageMan.setImageResource(intent.getStringExtra("imageMan")!!.toInt())
            textfirstname.text = intent.getStringExtra("textfirstname")
            textsurname.text = intent.getStringExtra("textsurname")
        }
    }
}