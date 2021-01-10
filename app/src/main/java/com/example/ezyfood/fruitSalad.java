package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class fruitSalad extends AppCompatActivity {

    EditText quant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fruit_salad);

        quant = (EditText)findViewById(R.id.quantFruit);
        Button ordMore = (Button) findViewById(R.id.orderBack);
        Button myOrd = (Button) findViewById(R.id.orderListBtn);
        Button thankYou = (Button) findViewById(R.id.okFruit);

        ordMore.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent whyDontYouOrderIt = new Intent(getApplicationContext(), layoutDrink.class);
                startActivity(whyDontYouOrderIt);
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

        thankYou.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String quantItem = quant.getText().toString();
                int quantNum = Integer.parseInt(quantItem);
                orderDataSave.orderSave.set(4, orderDataSave.orderSave.get(4) + quantNum);
                Intent yes = new Intent(getApplicationContext(), layoutSnack.class);
                startActivity(yes);
            }
        });

    }


}
