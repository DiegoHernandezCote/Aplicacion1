package com.quetzal.venda.aplicacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button boton, boton1;
    private TextView label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.boton);
        boton1 = (Button) findViewById(R.id.boton2);
        label = (TextView) findViewById(R.id.view1);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boton1();
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boton2();
            }
        });
    }

    private void Boton1(){
        label.setText("boton uno");
    }
    private void Boton2(){
        label.setText("Boton 2");
    }

}
