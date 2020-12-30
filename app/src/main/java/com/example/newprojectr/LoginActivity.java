package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3,tv4,tv5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv1 = findViewById(R.id.sent_otp);
        tv2 = findViewById(R.id.login_id);
        tv5 =findViewById(R.id.submit_id_login);
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,NestProDetails.class);
                startActivity(intent);
            }
        });
        tv4=findViewById(R.id.tv_forgot_username);

        tv3 = findViewById(R.id.forgot_password);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SahilDahiyaCircle.class);
                startActivity(intent);
            }
        });


    }
}
