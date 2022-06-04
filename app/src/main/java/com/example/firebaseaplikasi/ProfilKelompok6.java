package com.example.firebaseaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfilKelompok6 extends AppCompatActivity {
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_kelompok6);
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void pindah(View v){
        switch (v.getId() ){
            case R.id.daniel_alvaro:
                startActivity( new Intent(ProfilKelompok6.this, DetailCard1.class));
                break;
            case R.id.daniel_andhika:
                startActivity(new Intent(ProfilKelompok6.this, DetailCard2.class));
                break;
            case R.id.daniel_matanari:
                startActivity(new Intent(ProfilKelompok6.this, DetailCard3.class));
                break;
            case R.id.daffa:
                startActivity( new Intent(ProfilKelompok6.this, DetailCard4.class));
                break;
            case R.id.samuel:
                startActivity(new Intent(ProfilKelompok6.this, DetailCard5.class));
                break;
        }
    }
}