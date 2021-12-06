package com.example.ejercicio5;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity {
    //declaramos
    private EditText etcantidad;
    private EditText etvalor;
    private TextView tvresultado;
    private String cadena;
    private Stack<Character> pila = new Stack<Character>();
    private Button btn_aceptar;
   //

    private String cantF;
    private ListView ListViewlistaFracciones;
    private Button btn_operaciones;
    private int cantFracciones;
    private double sumatoriaFraccionesDecimal = 0;
    private int xd=0;

    ArrayList<String> fracciones;
    ArrayList<Double>listaResultadoDivisiones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etcantidad = (EditText) findViewById(R.id.cantidad);
        etvalor = (EditText) findViewById(R.id.valorFraccion);
        tvresultado = (TextView) findViewById(R.id.mostrarresultado);
        fracciones = new ArrayList<>();
    }
    //arreglo de string

    public String[] ingresoDatos(){
        String string =etvalor.getText().toString();
        String[] parts = string.split("/");
        return parts;
    }
    public class Fraccion {
       int num;
      int den;
  }
    public Fraccion(){
        String[] f1,f2;
    int numerador1,denominador1;
    int numerador2,denominador2;
    f1=ingresoDatos();
    f2=ingresoDatos();
    int[] suma=[(f2[1]*f1[0]+f1[1]*f2[0]),(f2[1]*f1[1])]
//un ciclo suman





    }
    public void sumarFracciones(Integer cantidad){
        for (int i=0; i<=cantidad;i++){
            String[] c= ingresoDatos();

        }
    }



    //metodo para ingresar la fraccion



    //metodo suma
    public void onClicAceptar(View view){
        String valor1= etcantidad.getText().toString();
        String valor2= etvalor.getText().toString();
        int numero1= Integer.parseInt(valor1);
        int numero2= Integer.parseInt(valor2);
        int suma= numero1+numero2;
        String resultado= String.valueOf(suma);
        tvresultado.setText(resultado);
    }
    //metodo para aceptar la cantidad ingresada
    public void CantidadFracciones(View view){
        String valor1= etcantidad.getText().toString();
        int numero1= Integer.parseInt(valor1);
    int candidadesNumeros[] = new int[numero1];

    }
//


}