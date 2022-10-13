package br.ulbra.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.text.DecimalFormat;

public class Compras2Activity extends AppCompatActivity {
    CheckBox checkbox1,checkbox2,checkbox3,checkbox4;
    Button bttotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox1 = findViewById(R.id.checkBox1);
        checkbox2 = findViewById(R.id.checkBox2);
        checkbox3 = findViewById(R.id.checkBox3);
        checkbox4 = findViewById(R.id.checkBox4);
        bttotal = findViewById(R.id.bttotal);
        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;
                DecimalFormat formater = new DecimalFormat("0.##");
                if (checkbox1.isChecked()){total += 2.69;}
                if (checkbox2.isChecked()){total += 5;}
                if (checkbox3.isChecked()){total += 9.7;}
                if (checkbox4.isChecked()){total += 2.7;}

                AlertDialog.Builder dialogo = new AlertDialog.Builder(Compras2Activity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra: "+ (formater.format(total)));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}