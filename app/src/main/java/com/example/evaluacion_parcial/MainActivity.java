package com.example.evaluacion_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user;
    EditText pass;
    Button   btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user =(EditText) findViewById(R.id.usuario);
        pass=(EditText) findViewById(R.id.passwd);
        btn=(Button) findViewById(R.id.btnn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().isEmpty()||pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Ingrese Usuario y Contraseña",Toast.LENGTH_LONG).show();

                }
                String usr=user.getText().toString();
                String ctn=pass.getText().toString();
                if (usr.equals("adm123")&ctn.equals("adm123")){
                    Intent I=new Intent(getApplicationContext(),MainActivity2.class);
                    I.putExtra("usua",usr);
                    I.putExtra("ctna",ctn);
                    startActivity(I);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Datos Incorrectos",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}