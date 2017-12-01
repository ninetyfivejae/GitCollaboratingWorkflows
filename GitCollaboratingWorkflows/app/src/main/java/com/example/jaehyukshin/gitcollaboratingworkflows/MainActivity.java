package com.example.jaehyukshin.gitcollaboratingworkflows;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button messiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messiButton = (Button)findViewById(R.id.messiButton);
        messiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MessiShoot();
            }
        });
    }

    public void MessiShoot(){
        Toast.makeText(getApplicationContext(), "Messi shoots in the corner of the left post", Toast.LENGTH_SHORT).show();
    }
}
