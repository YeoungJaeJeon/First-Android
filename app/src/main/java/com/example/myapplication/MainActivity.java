package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //onCreate=가장 먼저 실행되는 메소드(부모클래스에서 가져옴)
        setContentView(R.layout.activity_login); //setContentView(내용보기 설정) = 화면을 표시해주는 메소드(xml 리소스 id를 받아옴)
        // (res폴더 내에 layout폴더 속 xml파일을 가르킴.)
    }

    public void onClick/*xml파일에 추가한 온클릭 버튼? */(View view){
        Intent intent = new Intent(MainActivity.this,Finish.class);
        /*intent(시도)는 다른 무언가와 연결 시켜주는 기능?  현재 MainActitvity에서 Finish클래스로 이동 */
        startActivity(intent); //현재 엑티비티에서 시작해서 인텐트를 사용함
    }
}