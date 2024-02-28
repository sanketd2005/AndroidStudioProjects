package com.example.edittextandtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
EditText firstName,lastName,age,gender,email,mobileNo,instagramID;
Button submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        submit = findViewById(R.id.submit);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        email = findViewById(R.id.email);
        mobileNo = findViewById(R.id.mobileNo);
        instagramID = findViewById(R.id.instagramID);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                String Fname, Lname, MobNo, Gender, Age,iId,EId;
                Fname = firstName.getText().toString();
                Lname =lastName.getText().toString();
                MobNo = mobileNo.getText().toString();
                Gender = gender.getText().toString();
                Age = age.getText().toString();
                iId = instagramID.getText().toString();
                EId = email.getText().toString();
                intent.putExtra("Fname",Fname);
                intent.putExtra("Lname",Lname);
                intent.putExtra("MobNo",MobNo);
                intent.putExtra("Gender",Gender);
                intent.putExtra("Age",Age);
                intent.putExtra("iId",iId);
                intent.putExtra("EId",EId);
    /\
                startActivity(intent);
            }
        });
    }
}