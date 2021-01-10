package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layoutDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_drink);

        Button plusAlcohol = (Button) findViewById(R.id.alcBtn);
        Button plusAir = (Button) findViewById(R.id.airminBtn);
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

        plusAlcohol.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ord = new Intent(getApplicationContext(), alcohol.class);
                startActivity(ord);
            }
        });

        plusAir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ord = new Intent(getApplicationContext(), airMineral.class);
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
