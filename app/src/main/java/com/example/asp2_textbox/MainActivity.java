package com.example.asp2_textbox;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Inicializamos los elementos visuaes
    public EditText ed1, ed2;
    public TextView lbl1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Asigamos los valores

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.et2);

        lbl1 = findViewById(R.id.lbl1);

    }



    public void sumar(View v){

        // Asigamos s1 y s2 el valor ingresado en los edit text;
        String  s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();

        //Convertimos estos a enteros;
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        int suma = v1 + v2;

        lbl1.setText("La suma es :" + suma);

    }
}