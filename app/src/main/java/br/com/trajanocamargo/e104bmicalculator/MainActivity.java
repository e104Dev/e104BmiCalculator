package br.com.trajanocamargo.e104bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private static int peso = 70, altura = 150;
    private TextView textViewPeso, textViewAltura;
    private SeekBar mAltura;
    private ToggleButton toggleButtonHomem, toggleButtonMulher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void increase(View view) {
        peso++;
        textViewPeso.setText(String.valueOf(peso));
    }

    public void decrease(View view) {
        peso--;
        textViewPeso.setText(String.valueOf(peso));
    }

    public void toggleButtonChangeStatus(View view) {
        if(toggleButtonHomem.isChecked()) {
            toggleButtonHomem.setElevation(8);
            toggleButtonHomem.setBackgroundColor(Color.parseColor("#FF0000"));
            toggleButtonMulher.setChecked(false);
        }else{
            toggleButtonMulher.setChecked(true);
            toggleButtonHomem.setElevation(4);
            toggleButtonHomem.setBackgroundColor(Color.parseColor("#00FF00"));
        }
    }


}