package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage2);

        TextView name = (TextView) findViewById(R.id.fullNameTextView);
        name.setText(GlobalVariable.first_name + " " + GlobalVariable.last_name);


        //back to registration button
        Button back2Reg = (Button) findViewById(R.id.backToRegBtn);
        back2Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToRegistration();
            }
        });


    }
    public void backToRegistration(){
        Intent backToRegistration = new Intent(Homepage2.this, MainActivity.class);
        startActivity(backToRegistration);
    }

}