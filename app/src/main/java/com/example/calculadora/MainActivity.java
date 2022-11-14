package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText operando2= findViewById(R.id.operando2);
        EditText operando1 =findViewById(R.id.operando1);
        TextView textView = findViewById(R.id.resultado);
        Button btnsumar = findViewById(R.id.btnsumar);
        Button btnrestar = findViewById(R.id.btnrestar);
        Button btnmultiplicar= findViewById(R.id.btnmultiplicar);
        Button btndividir = findViewById(R.id.btndividir);
        Button btnlimpiar = findViewById(R.id.btnlimpiar);
        cursorprimeroperando();

        
        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = operando1.getText().toString();

                String num2 = operando2.getText().toString();


                try{
                int resul = Integer.parseInt(num1) + Integer.parseInt(num2);
                textView.setText("EL RESULTADO DE LA SUMA ES :" + resul);
                }
                catch (Exception e) {
                    textView.setText("DEBE INGRESAR UN VALOR(ES) NUMERICO");
                }
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = operando1.getText().toString();

                String num2 = operando2.getText().toString();

                try {
                    int resul = Integer.parseInt(num1) - Integer.parseInt(num2);
                    textView.setText("EL RESULTADO DE LA RESTA ES :" + resul);

                } catch (Exception e) {
                    textView.setText("DEBE INGRESAR UN VALOR(ES) NUMERICO");
                }
            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = operando1.getText().toString();

                String num2 = operando2.getText().toString();

                try{
                int resul = Integer.parseInt(num1) * Integer.parseInt(num2);
                textView.setText("EL RESULTADO DE LA MULTIPLICACION ES :" + resul);
                } catch (Exception e) {
                    textView.setText("DEBE INGRESAR UN VALOR(ES) NUMERICO");
                }


            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = operando1.getText().toString();

                String num2 = operando2.getText().toString();

                try{
                int resul = Integer.parseInt(num1) / Integer.parseInt(num2);
                textView.setText("EL RESULTADO DE LA DIVISION DE ENTEROS ES :" + resul);
                } catch (Exception e) {
                    textView.setText("DEBE INGRESAR UN VALOR(ES) NUMERICO O LA DIVISION POR CERO NO EXISTE");
                }

            }
        });

        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operando1.setText("");
                operando2.setText("");
                textView.setText("");
                //operando1.setFocusableInTouchMode(true);
               // operando1.requestFocus();
                cursorprimeroperando();

            }



        });

    }

    public void  cursorprimeroperando(){

        //ubica el foco en la primera caja de texto, tanto al principio de app y luego de limpiar las cajas de texto

        EditText operando1 =findViewById(R.id.operando1);

        operando1.setFocusableInTouchMode(true);
        operando1.requestFocus();

    }

}









