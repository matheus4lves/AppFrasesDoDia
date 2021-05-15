package com.cursoandroid.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] frases = {
            "Any intelligent fool can make things bigger and more complex. It takes a touch of " +
                    "genius - and a lot of courage - to move in the opposite direction. " +
                    "- Ernst Schumacher",
            "You can have data without information, but you cannot have information without" +
            "data. - Daniel Keys Moran",
            "If you want truly understand something, try to change it. - Kurt Lewin",
            "To achieve great things, two things are needed: a plan, and not quite enough time. " +
                    "- Leonard Bernstein"
    };

    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFraseAleatoria(View view) {
        TextView texto = findViewById(R.id.fraseDoDia);
        texto.setText(frases[r.nextInt(4)]);
    }
}