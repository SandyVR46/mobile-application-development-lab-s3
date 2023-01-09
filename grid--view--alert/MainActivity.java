package com.example.gridviewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.gridviewimage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] colorName = {"Red ","Black ","White ", "Green "};
        int[] colorImage = {R.drawable.red,R.drawable.black,R.drawable.white,R.drawable.green};


        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,colorName,colorImage);
        binding.gridView.setAdapter(gridAdapter);



        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Create the object of AlertDialog Builder class
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                // Set the message show for the Alert time
                builder.setMessage("You Clicked " + colorName[position]);

                // Set Alert Title
                builder.setTitle("Alert !");

                builder.setCancelable(false);


                // Create the Alert dialog

                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();
            }
        });


    }
}




//Toast.makeText(MainActivity.this, "You Clicked " + colorName[position], Toast.LENGTH_SHORT).show();
//builder.setCancelable(false);
//
//        // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
//        builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
//            // When the user click yes button then app will close
//            finish();
//        });
//
//        // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
//        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
//            // If user click no then dialog box is canceled.
//            dialog.cancel();
//        });