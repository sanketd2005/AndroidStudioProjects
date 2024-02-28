package com.example.arithmeticoperation;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    EditText num1;
    EditText num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.firstNumber);
        num2 = findViewById(R.id.secondNumber);

        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fN = num1.getText().toString();
                String sN = num2.getText().toString();
                int n1;
                n1 = Integer.parseInt(fN);
                int n2;
                n2 = Integer.parseInt(sN);
                int n3 = n1 + n2 ;
                Toast.makeText(MainActivity.this,"Addition is :"+n3  , LENGTH_SHORT).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fN = num1.getText().toString();
                String sN = num2.getText().toString();
                int n1;
                n1 = Integer.parseInt(fN);
                int n2;
                n2 = Integer.parseInt(sN);
                int n3 = n1 - n2 ;
                Toast.makeText(MainActivity.this,"Substraction is :"+n3  , LENGTH_SHORT).show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fN = num1.getText().toString();
                String sN = num2.getText().toString();
                int n1;
                n1 = Integer.parseInt(fN);
                int n2;
                n2 = Integer.parseInt(sN);
                int n3 = n1 * n2 ;
                Toast.makeText(MainActivity.this,"Multiplication is :"+n3  , LENGTH_SHORT).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fN = num1.getText().toString();
                String sN = num2.getText().toString();
                int n1;
                n1 = Integer.parseInt(fN);
                int n2;
                n2 = Integer.parseInt(sN);
                int n3 = n1 / n2 ;
                Toast.makeText(MainActivity.this,"Division is :"+n3  , LENGTH_SHORT).show();
            }
        });
    }
}