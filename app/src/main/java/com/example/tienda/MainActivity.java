package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3, et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtNombre);
        et2 = (EditText) findViewById(R.id.txtCodigo);
        et3 = (EditText) findViewById(R.id.txtPrecio);
        et4 = (EditText) findViewById(R.id.txtPrecioU);
    }
    public void agregar (View view){
        BaseD bdD = new BaseD(this, "db1", null, 1);
        SQLiteDatabase BaseDatos = bdD.getWritableDatabase();

        String nombre = et1.getText().toString();
        String codigo = et2.getText().toString();
        String precio = et3.getText().toString();
        String precioU = et4.getText().toString();

        if(!nombre.isEmpty() && !codigo.isEmpty() && !precio.isEmpty() && !precioU.isEmpty()){
            ContentValues registro = new ContentValues();

            registro.put("nombre",nombre);
            registro.put("codigo",codigo);
            registro.put("precio",precio);
            registro.put("precioU",precioU);

            BaseDatos.insert("productos",null, registro);
            BaseDatos.close();

            et1.setText("");
            et2.setText("");
            et3.setText("");
            et4.setText("");
        }else{
            if(nombre.isEmpty())
                et1.setError("Ingresa campo");
            if(codigo.isEmpty())
                et2.setError("Ingresa campo");
            if(precio.isEmpty())
                et3.setError("Ingresa campo");
            if(precioU.isEmpty())
                et4.setError("Ingresa campo");
        }
    }
}