package com.irwantostudio.edukatifin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),
                        "Register Berhasil!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    public void toLogin(View view) {
        Intent i=new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}
