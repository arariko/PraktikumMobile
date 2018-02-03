package com.example.arariko.studycase1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {
    TextView a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);

        a = (TextView) findViewById(R.id.namaMenu);
        b = (TextView) findViewById(R.id.jumlahPorsi);
        c = (TextView) findViewById(R.id.harga);
        d = (TextView) findViewById(R.id.restaurant);

        if (getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            a.setText(bundle.getString("Menu"));
            b.setText(bundle.getString("Jumlah"));
            c.setText(bundle.getString("Total"));
            d.setText(bundle.getString("Restaurant"));
        }
        else {
            a.setText(getIntent().getStringExtra("Menu"));
            b.setText(getIntent().getStringExtra("Jumlah"));
            c.setText(getIntent().getStringExtra("Total"));
            d.setText(getIntent().getStringExtra("Restaurant"));
        }
    }

}
