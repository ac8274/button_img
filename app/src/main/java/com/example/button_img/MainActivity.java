package com.example.button_img;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Random rand = new Random();
    private ImageButton button;
    private ImageView img;
    private int[] Id = {0,0,0,0,0,0};
    private int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.imageButton);
        img = findViewById(R.id.imageView);

        for(int i=0; i<6;i++)
        {
            String idear = "img"+i;
            Id[i] = getResources().getIdentifier(idear,"drawable",getPackageName());
        }
    }

    public void go(View view) {
        num = rand.nextInt(3);
        button.setImageResource(Id[num]);
        img.setImageResource(Id[num+3]);

    }
}