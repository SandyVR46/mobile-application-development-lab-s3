package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText emailTextField = (EditText) findViewById(R.id.l_emailTextField);
        EditText passwordField = (EditText) findViewById(R.id.l_passwordTextField);

        // login button
        Button loginButton = (Button) findViewById(R.id.loginBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emailTextField.getText().toString().equals(GlobalVariable.email)&&
                        passwordField.getText().toString().equals(GlobalVariable.password)
                ){
                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_LONG).show();
                    openHomePageActivity();
                } else {
                    Toast.makeText(Login.this, "Login Failed. Check email address and password.", Toast.LENGTH_LONG).show();
                }
            }

        });


    }

    public void openHomePageActivity(){
        Intent goToHome = new Intent(Login.this, Homepage2.class);
        startActivity(goToHome);
    }
}

