package com.pt2.kosz;

import android.os.Bundle;
import android.view.View;

import androidx.activity.ActivityFlags;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.pt2.kosz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    //int punkty = 0;
    PunktyViewModel punktyViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.textView2.setText(""+punktyViewModel.getPunkty());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addPunkty(1);
                binding.textView2.setText(""+punktyViewModel.getPunkty());
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addPunkty(2);
                binding.textView2.setText(""+punktyViewModel.getPunkty());
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addPunkty(3);
                binding.textView2.setText(""+punktyViewModel.getPunkty());
            }
        });

    }
}