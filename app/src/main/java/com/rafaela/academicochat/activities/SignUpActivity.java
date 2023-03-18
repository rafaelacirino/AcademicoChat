package com.rafaela.academicochat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rafaela.academicochat.R;
import com.rafaela.academicochat.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.textSigIn.setOnClickListener(v -> onBackPressed());
    }
}