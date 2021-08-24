package com.example.unconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
   private Button button2;
   private TextView textview4;
   private EditText editTextNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=findViewById(R.id.button2);
        textview4=findViewById(R.id.textView4);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             String s=editTextNumber2.getText().toString();
             int num=Integer.parseInt(s);
             String result = Integer.toBinaryString(num);
             textview4.setText("BINARY number of "+" " +num +" " +"is " +result);
            }
        });
    }
}