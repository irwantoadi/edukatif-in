package com.irwantostudio.edukatifin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KuponActivity extends AppCompatActivity {
    Button simpan_saran, klaim_kode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kupon);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        simpan_saran = findViewById(R.id.btn_simpan_saran);
        klaim_kode = findViewById(R.id.id_klaim);
        simpan_saran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Tersimpan!", Toast.LENGTH_SHORT).show();
            }
        });
        klaim_kode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Kode Tersalin!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
