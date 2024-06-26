package com.example.lifecourse

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.lifecourse.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.clMenu.isVisible = true
            binding.menuBtn.isVisible = false
            binding.btnSend.isVisible = false
            binding.linearLayout.isVisible = false
            binding.linearLayout2.isVisible = false
            binding.tvReg.isVisible = false
            binding.tvRegVUS.isVisible = false
            binding.tvRegPredpr.isVisible = false
        }

        binding.btnBack.setOnClickListener{
            binding.clMenu.isVisible = false
            binding.menuBtn.isVisible = true
            binding.btnSend.isVisible = true
            binding.linearLayout.isVisible = true
            binding.linearLayout2.isVisible = true
            binding.tvReg.isVisible = true
            binding.tvRegVUS.isVisible = true
            binding.tvRegPredpr.isVisible = true
        }

        binding.tvSignIn.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        binding.tvMenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.tvProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.btnSend.setOnClickListener {
            binding.edFac.text = null
            binding.edKaf.text = null
            binding.edGroup.text = null
            binding.edName.text = null
            binding.edSurname.text = null
            binding.edPassword.text = null
            binding.edMail.text = null
        }

        binding.tvRegVUS.setOnClickListener {
            val intent = Intent(this, RegForVUS::class.java)
            startActivity(intent)
        }

        binding.tvRegPredpr.setOnClickListener {
            val intent = Intent(this, RegForPredpr::class.java)
            startActivity(intent)
        }

        binding.tvReg.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }
    }
}