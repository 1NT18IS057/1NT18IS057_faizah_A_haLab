package com.example.addition_explicitintent_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Activity2 extends AppCompatActivity {
    TextView t1,t2,t3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        t1=findViewById(R.id.n1);
        t2=findViewById(R.id.n2);
        t3 =findViewById(R.id.sum);
        intent=getIntent();
        Bundle extras=intent.getExtras();
        String number1=extras.getString("num1");
        String number2=extras.getString("num2");
        String res=extras.getString("sum");

        t1.setText("Num1 is : "+number1);
        t2.setText("Num2 is : "+number2);
        t3.setText("Sum : "+res);

    }
}



