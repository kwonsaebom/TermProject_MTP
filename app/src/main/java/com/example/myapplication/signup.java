package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        //next 버튼 클릭시 자녀 정보 입력 창으로 이동
        Button next_btn = (Button) findViewById(R.id.nextButton_s);
        next_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), signup2.class);
                startActivity(intent);
            }
        });

        //이미 아이디가 있다면 로그인 화면으로
        Button login_btn = (Button) findViewById(R.id.loginButton_s);
        login_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
            }
        });

        //홈화면 누르면 시작 화면으로
        Button home_btn = (Button) findViewById(R.id.homeButton_s);
        home_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
