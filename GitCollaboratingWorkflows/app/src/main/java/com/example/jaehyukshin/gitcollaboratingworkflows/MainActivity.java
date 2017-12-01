package com.example.jaehyukshin.gitcollaboratingworkflows;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    Button plusButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.firstNumber);
        secondNumber = (EditText)findViewById(R.id.secondNumber);
        result = (TextView)findViewById(R.id.result);

        plusButton = (Button)findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultNumber = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());
                result.setText(Integer.toString(resultNumber));
            }
        });
    }
}
