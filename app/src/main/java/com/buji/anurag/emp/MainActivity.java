package com.buji.anurag.emp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText de,em,sa,pl;
Button b1;
String name,des,sal,place;
Empmodel empmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        em=(EditText)findViewById(R.id.em);
        de=(EditText)findViewById(R.id.de);
        sa=(EditText)findViewById(R.id.sa);
        pl=(EditText)findViewById(R.id.pl);
        b1=(Button)findViewById(R.id.su);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                empmodel=new Empmodel();
                name=em.getText().toString();
                des=de.getText().toString();
                sal=sa.getText().toString();
                place=pl.getText().toString();
                empmodel.setEmpname(name);
                empmodel.setDesignation(des);
                empmodel.setSalary(sal);
                empmodel.setPlace(place);

                Toast.makeText(getApplicationContext(),empmodel.getDesignation(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
