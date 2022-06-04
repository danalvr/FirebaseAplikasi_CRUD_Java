package com.example.firebaseaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pindah(View v){
        switch (v.getId() ){
            case R.id.add_mhs:
                startActivity( new Intent(MainActivity.this, TambahMhsActivity.class));
                break;
            case R.id.list_mhs:
                startActivity(new Intent(MainActivity.this, ListMhsActivity.class));
                break;
            case R.id.kelompok6:
                startActivity(new Intent(MainActivity.this, ProfilKelompok6.class));
                break;

        }
    }
}