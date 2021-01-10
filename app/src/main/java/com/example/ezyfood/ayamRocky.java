package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ayamRocky extends AppCompatActivity {

    EditText quant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_rocky);

        quant = (EditText) findViewById(R.id.quantRocky);
        Button ordMore = (Button) findViewById(R.id.orderBack);
        Button myOrd = (Button) findViewById(R.id.orderListBtn);
        Button thankYou = (Button) findViewById(R.id.okRocky);

        ordMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whyDontYouOrderIt = new Intent(getApplicationContext(), layoutFood.class);
                startActivity(whyDontYouOrderIt);
            }

        });

        myOrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goOrd = new Intent(getApplicationContext(), myOrder.class);
                startActivity(goOrd);
            }

        });

        thankYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quantItem = quant.getText().toString();
                int quantNum = Integer.parseInt(quantItem);
                orderDataSave.orderSave.set(1, orderDataSave.orderSave.get(1) + quantNum);
                Intent yes = new Intent(getApplicationContext(), layoutFood.class);
                startActivity(yes);
            }
        });

    }
}
