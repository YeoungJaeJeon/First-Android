package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton = findViewById(R.id.loginButton);
        Log.d("영재",""+loginButton.getId());
        Log.e("영재",""+loginButton.getId());
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "로그인버튼을 눌렀습니다", Toast.LENGTH_SHORT).show();
            }
        });

        Button facebookButton = findViewById(R.id.facebookButton);
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "페이스북버튼을 눌렀습니다", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
