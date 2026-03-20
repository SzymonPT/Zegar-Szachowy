package com.zegarszachowy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button3, button4;

    Gracz gracz1, gracz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        gracz1 = new Gracz(button3, true);
        gracz2 = new Gracz(button4, false);

        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gracz1.obrocAktywnosc();
                        gracz2.obrocAktywnosc();
                    }
                }
        );
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gracz1.obrocAktywnosc();
                        gracz2.obrocAktywnosc();
                    }
                }
        );
    }
}