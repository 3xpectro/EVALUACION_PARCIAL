package com.example.evaluacion_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton btnn;
    TextView total;
    TextView men;
    TextView women;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnn=(ImageButton) findViewById(R.id.IMG);
        total=(TextView)findViewById(R.id.total);
        men=(TextView)findViewById(R.id.hombres);
        women=(TextView)findViewById(R.id.mujeres);
        Bundle a=getIntent().getExtras();
        Integer totall=a.getInt("contadorTOTAL");
        Integer masculino=a.getInt("contadorHOMBRE");
        Integer femenino=a.getInt("contadorMUJER");
        total.setText(""+totall);
        men.setText(""+masculino);
        women.setText(""+femenino);



        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(I);
            }
        });
    }
}