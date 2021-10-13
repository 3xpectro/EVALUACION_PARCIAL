package com.example.evaluacion_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    Spinner sp;
    Button btnnn;
    ArrayList <String>lista =new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sp=(Spinner)findViewById(R.id.spinner);
        btnnn=(Button) findViewById(R.id.agregar);
        lista.add("...");
        lista.add("hombre");
        lista.add("mujer");

        ArrayAdapter<String>adaptere=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,lista);
        sp.setAdapter(adaptere);

        btnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(I);
            }
        });
    }


}