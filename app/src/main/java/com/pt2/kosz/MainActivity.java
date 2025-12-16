package com.pt2.kosz;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.ActivityFlags;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.pt2.kosz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    //int punkty = 0;
    PunktyViewModel punktyViewModel;
    PunktyViewModel2 punktyViewModel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);
        punktyViewModel2 = new ViewModelProvider(this).get(PunktyViewModel2.class);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        punktyViewModel.getPunkty().observe(this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        binding.textView2.setText(""+integer);
                    }
                }
        );
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addPunkty(1);
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addPunkty(2);
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addPunkty(3);
            }
        });
        //---------------------------
        punktyViewModel2.getPunkty2().observe(this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        binding.textView3.setText(""+integer);
                    }
                });
        binding.vbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel2.addPunkty2(1);

                Toast.makeText(MainActivity.this, "kajklik", Toast.LENGTH_SHORT).show();
            }
        });
        binding.vbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel2.addPunkty2(2);
            }
        });
        binding.vbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel2.addPunkty2(3);
            }
        });

    }
}