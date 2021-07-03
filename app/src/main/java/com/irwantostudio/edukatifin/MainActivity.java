package com.irwantostudio.edukatifin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_learning, btn_ebook, btn_bookstore, btn_voucher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_learning = findViewById(R.id.btn_learning);
        btn_ebook = findViewById(R.id.btn_ebook);
        btn_bookstore = findViewById(R.id.btn_bookstore);
        btn_voucher = findViewById(R.id.btn_voucher);

        btn_learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, LearningActivity.class);
                startActivity(i);
            }
        });
        btn_ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, EbookActivity.class);
                startActivity(i);
            }
        });
        btn_bookstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, BookstroreActivity.class);
                startActivity(i);
            }
        });
        btn_voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, KuponActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        myAlert(MainActivity.this);
    }

    private void myAlert(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("Keluar?")
                .setMessage("Apakah yakin akan keluar aplikasi?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}
