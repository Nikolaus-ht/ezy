package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sld;
    String setTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button fod = (Button) findViewById(R.id.foodBtn);
        Button dri = (Button) findViewById(R.id.drinkBtn);
        Button topUp = (Button) findViewById(R.id.topUpBtn);
        Button snack = (Button) findViewById(R.id.snackBtn);
        Button myOrd = (Button) findViewById(R.id.orderListBtn);

        sld = (TextView)findViewById(R.id.sald);
        sld.setText(String.format("Rp. %d", saldoKlas.money));

        fod.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goFood = new Intent(getApplicationContext(), layoutFood.class);
                startActivity(goFood);
            }

        });

        dri.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goDrink = new Intent(getApplicationContext(), layoutDrink.class);
                startActivity(goDrink);
            }

        });

        topUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goTopUp = new Intent(getApplicationContext(), topUp.class);
                startActivity(goTopUp);
            }

        });

        snack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goSnack = new Intent(getApplicationContext(), layoutSnack.class);
                startActivity(goSnack);
            }

        });

        myOrd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goOrd = new Intent(getApplicationContext(), myOrder.class);
                startActivity(goOrd);
            }

        });


    }
}
