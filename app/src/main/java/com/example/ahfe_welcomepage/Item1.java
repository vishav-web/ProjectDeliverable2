package com.example.ahfe_welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item1 extends AppCompatActivity {
Button secondPage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item1);

        secondPage1 = (Button)findViewById(R.id.item1_back);


        secondPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });

    }
    public void backActivity(){
        Intent item1 = new Intent(this,SecondPage.class);
        startActivity(item1);
        finish();
    }
}
