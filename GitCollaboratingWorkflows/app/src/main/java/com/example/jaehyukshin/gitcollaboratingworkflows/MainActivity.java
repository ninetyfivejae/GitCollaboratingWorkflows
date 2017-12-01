package com.example.jaehyukshin.gitcollaboratingworkflows;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button messiButton;
    Button ronaldoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messiButton = (Button) findViewById(R.id.messiButton);
        messiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "FC Barcelona", Toast.LENGTH_SHORT).show();
            }
        });

        ronaldoButton = (Button) findViewById(R.id.ronaldoButton);
        ronaldoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RonaldoPass();
            }
        });
    }

    public void RonaldoPass(){
        Toast.makeText(getApplicationContext(), "Ronaldo passes the ball", Toast.LENGTH_SHORT).show();
    }
}
