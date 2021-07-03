package com.irwantostudio.edukatifin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PenugasanActivity extends AppCompatActivity {

    Button btn_simpan_tugas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penugasan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        btn_simpan_tugas = findViewById(R.id.btn_simpan_tugas);
        btn_simpan_tugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Tersimpan!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
