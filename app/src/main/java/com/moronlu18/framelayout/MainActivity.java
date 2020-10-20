package com.moronlu18.framelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvPhrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPhrase = findViewById(R.id.tvPhrase);
    }

    /**
     * Método que cambia la visibilidad del texto
     *
     * @param view
     */
    public void changeVisibility(View view) {

        //Hacemos uso del IF ternario
        tvPhrase.setVisibility((View.VISIBLE == tvPhrase.getVisibility()) ? View.INVISIBLE : View.VISIBLE);
    }
}
