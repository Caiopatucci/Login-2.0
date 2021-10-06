package br.com.etecia.login_20;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnLogar, btnCreate;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogar = (Button) findViewById(R.id.btnLogar);
        btnCreate = (Button) findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnCreateActivity();

            }
        });




        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnLogarActivity();

            }
        });


    }

    private void btnCreateActivity() {
        startActivity(new Intent(MainActivity.this, Create.class));
    }

    private void btnLogarActivity() {
        startActivity(new Intent(MainActivity.this, Login.class));
    }



}