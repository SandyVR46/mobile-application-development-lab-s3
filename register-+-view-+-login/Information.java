package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        TextView firstnameTxtView = (TextView) findViewById(R.id.i_firstnameTextView);
        TextView lastnameTxtView = (TextView) findViewById(R.id.i_lastnameTextView);
        TextView birthdateTxtView = (TextView) findViewById(R.id.i_birthdateTextView);
        TextView emailTxtView = (TextView) findViewById(R.id.i_emailTextView);

        // user input (global variables)
        firstnameTxtView.setText(GlobalVariable.first_name);
        lastnameTxtView.setText(GlobalVariable.last_name);
        birthdateTxtView.setText(GlobalVariable.birthdate);
        emailTxtView.setText(GlobalVariable.email);

        // save button and login button
        Button saveButton = (Button) findViewById(R.id.saveBtn);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });

        Button backButton = (Button) findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToRegistration();
            }
        });

    }

    public void openLoginActivity(){
        Intent goToLogin = new Intent(Information.this, Login.class);
        startActivity(goToLogin);
    }

    public void backToRegistration(){
        Intent backToReg = new Intent(Information.this,MainActivity.class);
        startActivity(backToReg);
    }
}