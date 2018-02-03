package com.example.arariko.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText namaMenu, jmlh;
    private Button restaurant1, restaurant2;
    private TextView tempatMakan;
    private int nominal = 65500;
    private int jumlah1, hsl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaMenu = (EditText) findViewById(R.id.namaMakanan);
        jmlh = (EditText) findViewById(R.id.porsi);
        tempatMakan = (TextView) findViewById(R.id.restaurant);
        restaurant1 = (Button) findViewById(R.id.btnEatbus);
        restaurant2 = (Button) findViewById(R.id.btnAbnormal);

    }

    public void makanatbus (View view){
        String menu = namaMenu.getText().toString();
        String jumlah = jmlh.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hsl = jumlah1 * 50000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);
        bundle.putString("Jumlah", jumlah);
        bundle.putString("Total", String.valueOf(hsl));
        bundle.putString("Restaurant", "Eatbus");

        Intent a = new Intent(this, Hasil.class);
        a.putExtras(bundle);
        startActivity(a);

        if(hsl > nominal){
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Disini aja Makan Malamnya", Toast.LENGTH_LONG).show();
        }
    }
    public void makanabnormal (View view){
        String menu = namaMenu.getText().toString();
        String jumlah = jmlh.getText().toString();
        jumlah1 = Integer.parseInt(jumlah.trim());

        hsl = jumlah1 * 30000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);
        bundle.putString("Jumlah", jumlah);
        bundle.putString("Total", String.valueOf(hsl));
        bundle.putString("Restaurant", "Abnormal");

        Intent a = new Intent(this, Hasil.class);
        a.putExtras(bundle);
        startActivity(a);

        if(hsl < nominal){
            Toast.makeText(this,"Disini aja Makan Malamnya", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();

        }
    }

}
