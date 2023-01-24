package com.murat.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murat.lesson2.databinding.ActivityMainBinding

private var text = arrayListOf<String>()

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        initClicker()

    }

    private fun initClicker() {
        viewBinding.btnAdd.setOnClickListener {
            text.add(viewBinding.editText.text.toString())
            viewBinding.editText.text.clear()

        }

        viewBinding.btnPrint.setOnClickListener {
            viewBinding.textView.text = text.toString()

        }

    }
}