package com.example.chatapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.chatapplication.R;

public class IntroActivity extends AppCompatActivity {

    private ConstraintLayout btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btnStart=findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroActivity.this,MainActivity.class));
            }
        });
    }
}