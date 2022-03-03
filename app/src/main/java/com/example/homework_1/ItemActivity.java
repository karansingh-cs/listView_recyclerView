package com.example.homework_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import com.example.homework_1.databinding.ActivityItemBinding;


public class ItemActivity extends AppCompatActivity {

    ActivityItemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null) {

            String name = intent.getStringExtra("name");
            String rich = intent.getStringExtra("rich");

            binding.foodName.setText(name);
            binding.nutrition.setText(rich);
        }
    }
}
