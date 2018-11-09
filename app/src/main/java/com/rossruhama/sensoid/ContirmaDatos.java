package com.rossruhama.sensoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContirmaDatos extends AppCompatActivity {

    private TextView tNombre;
    private TextView  tContraseña;
    private TextView tEmail;
    private TextView tDescripcion;

    private TextView tFecha;


     Button editarDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contirma_datos);

        tNombre = (TextView) findViewById(R.id.textNombre);
        tContraseña= (TextView) findViewById(R.id.textPassword);
        tEmail= (TextView) findViewById(R.id.textEmail);
        tDescripcion = (TextView) findViewById(R.id.textDescripcion);
        tFecha = (TextView) findViewById(R.id.textFecha);

        editarDatos = (Button) findViewById(R.id.btnEditarDatos) ;

        Bundle parametros= getIntent().getExtras();
        String  nombre = getIntent().getStringExtra("nombreCompleto");
        String password = getIntent().getStringExtra("contraseña");
        String email = getIntent().getStringExtra("email");
        String descripcion = getIntent().getStringExtra("descripcion");

        String fecha= getIntent().getStringExtra("fecha");

       // parametros.getBundle(year);


        tNombre.setText(nombre);
        tContraseña.setText(password);
        tEmail.setText(email);
        tDescripcion.setText(descripcion);
        tFecha.setText(fecha);

        editarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContirmaDatos.this, MainActivity.class);
                i.putExtra("nombreCompleto",tNombre.getText());
              i.putExtra("contraseña", tContraseña.getText());
                i.putExtra("email", tEmail.getText() );
                i.putExtra("descripcion",tDescripcion.getText());
                startActivity(i);
            }
        });
    }


}
