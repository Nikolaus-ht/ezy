package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class myOrder extends AppCompatActivity {

    TextView f0, f1, f2, f3, f4, f5, fTots;
    String textSet;

    int priceJust[] ={20000, 5000, 20000, 500000, 30000, 26000};
    int pricePayNow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_take);

        Button hapus1 = (Button) findViewById(R.id.hNasi);
        Button hapus2 = (Button) findViewById(R.id.hRocky);
        Button hapus3 = (Button) findViewById(R.id.hAir);
        Button hapus4 = (Button) findViewById(R.id.hAlcohol);
        Button hapus5 = (Button) findViewById(R.id.hFruit);
        Button hapus6 = (Button) findViewById(R.id.hMartabak);
        Button bayarCuyDahCape = (Button) findViewById(R.id.PAY);

        f0 = (TextView) findViewById(R.id.qNasi);
        textSet = orderDataSave.orderSave.get(0).toString();
        f0.setText(textSet);

        f1 = (TextView) findViewById(R.id.qRocky);
        textSet = orderDataSave.orderSave.get(1).toString();
        f1.setText(textSet);

        f2 = (TextView) findViewById(R.id.qAir);
        textSet = orderDataSave.orderSave.get(2).toString();
        f2.setText(textSet);

        f3 = (TextView) findViewById(R.id.qAlcohol);
        textSet = orderDataSave.orderSave.get(3).toString();
        f3.setText(textSet);

        f4 = (TextView) findViewById(R.id.qFruit);
        textSet = orderDataSave.orderSave.get(4).toString();
        f4.setText(textSet);

        f5 = (TextView) findViewById(R.id.qMartabak);
        textSet = orderDataSave.orderSave.get(5).toString();
        f5.setText(textSet);

        for(int i = 0; i < 6; i++)
        {
            pricePayNow += orderDataSave.orderSave.get(i) * priceJust[i];
        }

        fTots = (TextView) findViewById(R.id.hargaTotal);
        fTots.setText(String.format("Rp. %d", pricePayNow));


        hapus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pricePayNow -= orderDataSave.orderSave.get(0) * priceJust[0];
                fTots.setText(String.format("Rp. %d", pricePayNow));
                orderDataSave.orderSave.set(0, 0);
                textSet = orderDataSave.orderSave.get(0).toString();
                f0.setText(textSet);
            }
        });

        hapus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pricePayNow -= orderDataSave.orderSave.get(1) * priceJust[1];
                fTots.setText(String.format("Rp. %d", pricePayNow));
                orderDataSave.orderSave.set(1, 0);
                textSet = orderDataSave.orderSave.get(1).toString();
                f1.setText(textSet);
            }
        });

        hapus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pricePayNow -= orderDataSave.orderSave.get(2) * priceJust[2];
                fTots.setText(String.format("Rp. %d", pricePayNow));
                orderDataSave.orderSave.set(2, 0);
                textSet = orderDataSave.orderSave.get(2).toString();
                f2.setText(textSet);
            }
        });

        hapus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pricePayNow -= orderDataSave.orderSave.get(3) * priceJust[3];
                fTots.setText(String.format("Rp. %d", pricePayNow));
                orderDataSave.orderSave.set(3, 0);
                textSet = orderDataSave.orderSave.get(3).toString();
                f3.setText(textSet);
            }
        });

        hapus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pricePayNow -= orderDataSave.orderSave.get(4) * priceJust[4];
                fTots.setText(String.format("Rp. %d", pricePayNow));
                orderDataSave.orderSave.set(4, 0);
                textSet = orderDataSave.orderSave.get(4).toString();
                f4.setText(textSet);
            }
        });

        hapus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pricePayNow -= orderDataSave.orderSave.get(5) * priceJust[5];
                fTots.setText(String.format("Rp. %d", pricePayNow));
                orderDataSave.orderSave.set(5, 0);
                textSet = orderDataSave.orderSave.get(5).toString();
                f5.setText(textSet);
            }
        });

        bayarCuyDahCape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderDataSave.orderSave.set(0, 0);
                textSet = orderDataSave.orderSave.get(0).toString();
                f0.setText(textSet);

                orderDataSave.orderSave.set(1, 0);
                textSet = orderDataSave.orderSave.get(1).toString();
                f1.setText(textSet);

                orderDataSave.orderSave.set(2, 0);
                textSet = orderDataSave.orderSave.get(2).toString();
                f2.setText(textSet);

                orderDataSave.orderSave.set(3, 0);
                textSet = orderDataSave.orderSave.get(3).toString();
                f3.setText(textSet);

                orderDataSave.orderSave.set(4, 0);
                textSet = orderDataSave.orderSave.get(4).toString();
                f4.setText(textSet);

                orderDataSave.orderSave.set(5, 0);
                textSet = orderDataSave.orderSave.get(5).toString();
                f5.setText(textSet);

                pricePayNow = 0;
                fTots.setText(String.format("Rp. %d", pricePayNow));

                saldoKlas.money -= pricePayNow;

                Intent selesai = new Intent(getApplicationContext(), orderComplete.class);
                startActivity(selesai);
            }
        });


    }

}
