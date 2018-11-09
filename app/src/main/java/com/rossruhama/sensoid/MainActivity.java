package com.rossruhama.sensoid;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

     private DatePickerDialog.OnDateSetListener mDateSetListener;
     private Button mDisplayDate;
     private static final String TAG ="MainActivity";
     private Button btnSiguiente;


     //experimento
     private EditText etNombre;
     private EditText etContraseña;
     private EditText etEmail;
     private EditText etDescripcion;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         mDisplayDate = (Button) findViewById(R.id.tvDate);
         btnSiguiente = (Button) findViewById(R.id.btnSiguiente);

         //experimeto
         etNombre = (EditText) findViewById(R.id.etNombre);
         etContraseña = (EditText) findViewById(R.id.etPassword);
         etEmail = (EditText) findViewById(R.id.etEmail);
         etDescripcion = (EditText) findViewById(R.id.mctvDescripcion);


         Bundle parametros= getIntent().getExtras();
         String  nombre1 = getIntent().getStringExtra("nombreCompleto");
         String password1 = getIntent().getStringExtra("contraseña");
         String email1 = getIntent().getStringExtra("email");
         String descripcion1 = getIntent().getStringExtra("descripcion");


         etNombre.setText(nombre1);
         etContraseña.setText(password1);
         etEmail.setText(email1);
         etDescripcion.setText(descripcion1);
        // etFecha.setText(fecha);

         mDisplayDate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i=  new Intent(MainActivity.this,ContirmaDatos.class);

                 Calendar cal = Calendar.getInstance();
                 int anio = cal.get(Calendar.YEAR);
                 int mes = cal.get(Calendar.MONTH);
                 int dia = cal.get(Calendar.DAY_OF_MONTH);



                 DatePickerDialog dialog = new DatePickerDialog(
                         MainActivity.this,
                         android.R.style.Theme_Holo_Dialog_MinWidth,
                         mDateSetListener, anio, mes, dia);
                 dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                 dialog.show();

                 i.putExtra("anio",anio);
                 i.putExtra("mes",mes);
                 i.putExtra("dia",dia);
                 startActivity(i);

             }
         });


         mDateSetListener = new DatePickerDialog.OnDateSetListener() {
             @Override
             public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                 Log.d(TAG, "on DateSet date:" + year + "/" + month + "/" + dayOfMonth);

             }
         };


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(MainActivity.this, ContirmaDatos.class);
                 i.putExtra("nombreCompleto", etNombre.getText() + " ");
                 i.putExtra("contraseña", etContraseña.getText() + " ");
                 i.putExtra("email", etEmail.getText() + " ");
                 i.putExtra("descripcion",etDescripcion.getText()+" ");
                 startActivity(i);
             }
         });


     }



}





