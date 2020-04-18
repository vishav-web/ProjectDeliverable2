package com.example.ahfe_welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {


    int quantity1=0;
    int quantity2 = 0;
    int quantity3=0;
    int quantity4=0;


    Button Item1;
    Button Item2;
    Button Item3;
    Button Item4;


    Button item1inc;
    Button item1dec;
    Button item2inc;
    Button item2dec;
    Button item3inc;
    Button item3dec;
    Button item4inc;
    Button item4dec;

    TextView item1;
    TextView item2;
    TextView item3;
    TextView item4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);


        Item1= (Button)findViewById(R.id.item_1);
        Item2= (Button)findViewById(R.id.item_2);
        Item3= (Button)findViewById(R.id.item_3);
        Item4= (Button)findViewById(R.id.item_4);

        item1dec = (Button)findViewById(R.id.item1_dec);
        item2dec = (Button)findViewById(R.id.item2_dec);
        item3dec = (Button)findViewById(R.id.item3_dec);
        item4dec = (Button)findViewById(R.id.item4_dec);
        item1inc = (Button)findViewById(R.id.item1_inc);
        item2inc = (Button)findViewById(R.id.item2_inc);
        item3inc = (Button)findViewById(R.id.item3_inc);
        item4inc = (Button)findViewById(R.id.item4_inc);

        item1= (TextView)findViewById(R.id.item1_qua);
        item2= (TextView)findViewById(R.id.item2_qua);
        item3= (TextView)findViewById(R.id.item3_qua);
        item4= (TextView)findViewById(R.id.item4_qua);




        Item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startItem1();
            }
        });

        Item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startItem2();
            }
        });

        Item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startItem3();
            }
        });

        Item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startItem4();
            }
        });


        item1dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity1>0)
                quantity1--;
                item1.setText(Integer.toString(quantity1));
            }
        });

        item2dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity2>0)
                    quantity2--;
                item2.setText(Integer.toString(quantity2));
            }
        });

        item3dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity3>0)
                    quantity3--;
                item3.setText(Integer.toString(quantity3));
            }
        });

        item4dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity4>0){
                    quantity4--;
                    item4.setText(Integer.toString(quantity4));
                }
            }
        });

        item1inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity1++;
                item1.setText(Integer.toString(quantity1));
            }
        });
        item2inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity2++;
                item2.setText(Integer.toString(quantity2));
            }
        });
        item3inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity3++;
                item3.setText(Integer.toString(quantity3));
            }
        });

        item4inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity4++;
                item4.setText(Integer.toString(quantity4));
            }
        });
    }
    public void startItem1(){
        Intent intent = new Intent(this,Item1.class);
        startActivity(intent);
        finish();
    }

    public void startItem2(){
        Intent item2 = new Intent(this,Item2.class);
        startActivity(item2);
        finish();

    }
    public void startItem3(){
        Intent item3 = new Intent(this, Item3.class);
        startActivity(item3);
        finish();

    }
    public void startItem4(){
        Intent item4 = new Intent(this, Item4.class);
        startActivity(item4);
        finish();
    }
}
