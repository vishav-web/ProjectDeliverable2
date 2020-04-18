package com.example.ahfe_welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item4 extends AppCompatActivity {
    Button secondPage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);
        secondPage4 = (Button)findViewById(R.id.item4_back);


        secondPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });
    }
    public void backActivity(){
        Intent back4 = new Intent(this, SecondPage.class);
        startActivity(back4);
        finish();
    }
}
