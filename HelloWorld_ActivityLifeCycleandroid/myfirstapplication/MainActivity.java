package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy( invoked");
    }
}