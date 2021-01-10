package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;


public class layoutFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_food);

        Button plusNasgor = (Button) findViewById(R.id.nasgorBtn);
        Button plusRocky = (Button) findViewById(R.id.rockyBtn);
        Button backBtn = (Button) findViewById(R.id.rtnBtn);
        Button ordList = (Button) findViewById(R.id.orderListBtn);


        backBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ret = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ret);
            }
        });

        plusNasgor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ord = new Intent(getApplicationContext(), nasiGoreng.class);
                startActivity(ord);
            }
        });

        plusRocky.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ord = new Intent(getApplicationContext(), ayamRocky.class);
                startActivity(ord);
            }
        });

        ordList.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent listing = new Intent(getApplicationContext(), myOrder.class);
                startActivity(listing);
            }
        });


    }


}
