package com.jongdroid.studyandroid_01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


/**
 *  안드로이드 학습 용도로 사용할 예정 2021.05.10
 *
 *  1.버튼 클릭 리스너와 버튼 onClick 속성을 이용한 토스트메시지
 *  
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        Button btn = findViewById(R.id.btn1);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

    }
    
    public void onbutton (View v) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}

