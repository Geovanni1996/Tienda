package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void menu (View view){
        Toast.makeText(this, "producto agregado", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, MainActivity4.class);
        startActivityForResult(intent, 0);

    }
}