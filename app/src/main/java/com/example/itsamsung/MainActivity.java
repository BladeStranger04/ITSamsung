package com.example.itsamsung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solveEquation (View view){
        double a = Double.parseDouble(((EditText)
                findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble(((EditText)
                findViewById(R.id.b)).getText().toString());
        double c = Double.parseDouble(((EditText)
                findViewById(R.id.c)).getText().toString());
        double d = b * b - 4 * a * c;
        if (a == 0 & b == 0 & c == 0) {
            TextView result = (TextView) findViewById(R.id.res);
            result.setText("any");
        } else if (d == 0) {
            TextView result = (TextView) findViewById(R.id.res);
            result.setText("" + String.valueOf(-b / (2 * a)));
        } else if (d > 0){
            TextView result = (TextView) findViewById(R.id.res);
            if (a == 0) {
                result.setText("" + String.valueOf(-b + Math.sqrt(d)) +
                        "  " + String.valueOf(-b - Math.sqrt(d)));
            } else {
                result.setText("" + String.valueOf(-b + Math.sqrt(d) / (2 * a)) +
                        "  " + String.valueOf(-b - Math.sqrt(d) / (2 * a)));
            }
        } else if (d < 0) {
            TextView result = (TextView) findViewById(R.id.res);
            result.setText("none");
        }
    }
}
