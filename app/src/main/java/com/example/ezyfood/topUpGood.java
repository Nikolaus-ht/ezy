package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class topUpGood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gud_job);

        Button goBackNow = findViewById(R.id.goBackBro);

        goBackNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ret = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ret);
            }
        });
    }

}
