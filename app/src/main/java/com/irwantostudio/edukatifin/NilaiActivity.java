package com.irwantostudio.edukatifin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NilaiActivity extends AppCompatActivity {

    Button btn_oke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);

        btn_oke = findViewById(R.id.btn_oke);
        btn_oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NilaiActivity.this, LearningActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
