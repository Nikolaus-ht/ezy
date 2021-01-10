package com.example.ezyfood;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class topUp extends AppCompatActivity {

    EditText quant;
    int theB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_top_up);

        quant = (EditText)findViewById(R.id.sald);
        Button goBackNow = (Button)findViewById(R.id.goBackBro);
        Button topNow = (Button)findViewById(R.id.topUp);

        goBackNow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ret = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ret);
            }
        });

        topNow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                theB = Integer.parseInt(quant.getText().toString());
                int temp = theB;

                if (temp <= 2000000 && temp >= 0)
                {
                    saldoKlas.money += temp;
                    Intent good = new Intent(getApplicationContext(), topUpGood.class);
                    startActivity(good);
                }

            }
        });

    }

}
