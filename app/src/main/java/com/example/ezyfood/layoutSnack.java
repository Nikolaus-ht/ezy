package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layoutSnack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_snack);

        Button plusFruit = (Button) findViewById(R.id.frsalBtn);
        Button plusMartabak = (Button) findViewById(R.id.martkBtn);
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

        plusFruit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ord = new Intent(getApplicationContext(), fruitSalad.class);
                startActivity(ord);
            }
        });

        plusMartabak.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ord = new Intent(getApplicationContext(), martabak.class);
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
