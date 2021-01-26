package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText et;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et = (EditText)findViewById(R.id.txtema);
        et1 = (EditText)findViewById(R.id.txtpass);
        SharedPreferences preferences = getSharedPreferences("nombre", Context.MODE_PRIVATE);
        et.setText(preferences.getString("email", ""));


        if(preferences.contains("email"))
        {
            Intent intent = new Intent(this, MainActivity5.class);
            startActivity(intent);

            finish();
        }

    }
    public void ingresar(View view)
    {
        SharedPreferences preferences = getSharedPreferences("nombre", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        String nombreE = et.getText().toString();
        String pass = et1.getText().toString();

        editor.putString("email", nombreE);
        editor.putString("password", pass);

        editor.commit();

        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
        finish();
    }
}