package com.example.masteradapter;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageCube;
    ImageView imageCylinder;
    ImageView imagePrism;
    ImageView imageSphere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageCube = (ImageView) findViewById(R.id.imageViewCube);
        imageCylinder = findViewById(R.id.imageViewClinder);
        imagePrism = findViewById(R.id.imageViewPrism);
        imageSphere = findViewById(R.id.imageViewSphere);


        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        //imageCube.setOnClickListener();
    }
}