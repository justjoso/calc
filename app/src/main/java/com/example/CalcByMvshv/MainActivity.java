package com.example.CalcByMvshv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.CalcByMvshv.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        View.OnClickListener loadIt = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), calculatorActivity.class);
                startActivity(intent);
            }
        };
        Button clickMe = findViewById(R.id.clickMe);
        clickMe.setOnClickListener(loadIt);
    }

//    public void loadTheCalculatorr(){
//        Intent loaderC = new Intent(this, calculatorActivity.class);
//        startActivity(loaderC);
//    }

    //        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Button b = (Button) view;
//                inputNumber.append(b.getText().toString());
//            }
//        };
//        calculated.append(clickMe.getText().toString());
//        }

}
