package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void agregar (View view){
        Intent intent = new Intent(MainActivity4.this, MainActivity.class);
        startActivityForResult(intent, 0);
        finish();
    }
    public void eliminar (View view){
        Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
        startActivityForResult(intent, 0);
        finish();
    }
    public void mod_bus (View view){
        Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
        startActivityForResult(intent, 0);
        finish();
    }


}