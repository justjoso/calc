package com.example.CalcByMvshv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView calculated;
    private EditText inputNumber;
    private TextView op;

    //var to hold operands and type of calc
    private Double num1 = null;
    private Double num2 = null;
    private String operation = "=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculated = findViewById(R.id.calculated);
        inputNumber = findViewById(R.id.inputNum);
        op = findViewById(R.id.operator);

        Button b1 =  (Button) findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b0 = findViewById(R.id.b0);
        Button bDot = findViewById(R.id.dot);

        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.multiply);
        Button div = findViewById(R.id.divide);
        Button eq = findViewById(R.id.eq);

        Button clickMe =  findViewById(R.id.button);



        View.OnClickListener loadCalc = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.acivity_1);
            }
        };
        clickMe.setOnClickListener(loadCalc);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                inputNumber.append(b.getText().toString());
            }
        };
        calculated.append(clickMe.getText().toString());
        }

}
