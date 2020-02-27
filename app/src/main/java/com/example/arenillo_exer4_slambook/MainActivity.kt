package com.example.arenillo_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.arenillo_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myForm: MyForm = MyForm("","",0,"","","","","","","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.done.setOnClickListener {
            addForm(it)
        }
    }

    private fun addForm(view: View) {
//        val editText = binding.nicknameEdit
//        val nicknameTextView = binding.nicknameText
        binding.apply {
            myForm?.name = editName.text.toString()
            invalidateAll()
//            binding.nicknameEdit.visibility = View.GONE
//            binding.doneButton.visibility = View.GONE
//            binding.nicknameText.visibility = View.VISIBLE
        }
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
