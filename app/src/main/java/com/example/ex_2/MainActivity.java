package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button bt;
    String user,pas,cpas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.username);
        e2= (EditText) findViewById(R.id.password);
        e3= (EditText) findViewById(R.id.cpassword);
        bt= (Button) findViewById(R.id.submit);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user=e1.getText().toString();
                pas=e2.getText().toString();
                cpas=e3.getText().toString();
                if(pas.equals(cpas)){
                    Toast.makeText(getApplicationContext(),"Username: "+user+"\nPassword: "+pas,Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Password mismatch", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}