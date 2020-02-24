package com.proyectoA.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button boton1 = findViewById(R.id.button01);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "BIENVENIDO",Toast.LENGTH_SHORT).show();

                intentExample();
            }

        });
    }

    private void intentExample(){
        Intent intent=new Intent(this, Main2Activity.class);
        startActivity(intent);

    }






    }

