package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //onCreate=가장 먼저 실행되는 메소드(저장된 인스턴스 상태)
        setContentView(R.layout.activity_login); //setContentView(내용보기 설정) = 화면을 표시해주는 메소드(xml 리소스 id를 받아옴)
        // (res폴더 내에 layout폴더 속 xml파일을 가르킴.)

        Button loginButton =findViewById(R.id.loginButton); //버튼클래스의 이름을 정하고 = 불러올 xml버튼을 id로 찾아 보기
        loginButton.setOnClickListener(new View.OnClickListener() { //로그인 버튼에 듣는 기능 설정하고 사용할수 있게 새로운 객체를 생성함.
            @Override
            public void onClick(View view) { //클릭시 보여지는 것
                Intent intent = new Intent(MainActivity.this,Finish.class);
                /*intent는 다른 엑티비티를 연결 시켜주는 기능?  현재 MainActitvity에서 Finish클래스로 이동 */
                startActivity(intent); //현재 엑티비티에서 시작해서 인텐트를 사용함
            }
        });
        Button facebookButton = findViewById(R.id.facebookButton);
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"페이스북은 활성화되지 않음",Toast.LENGTH_SHORT).show();
    }          //토스트는 메세지 팝업을 뛰울때 사용 ---- 토스트객체안의 makeText메소드 사용.
               //*context*가 뭐지?,전달할 메세지,토스트를 전달할 시간(LENGTH_LONG 길게) show도 토스트 내의 메소드
        });
    }
}