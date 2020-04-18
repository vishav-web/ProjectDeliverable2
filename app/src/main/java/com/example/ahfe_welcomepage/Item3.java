package com.example.ahfe_welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item3 extends AppCompatActivity {
    Button secondPage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);
        secondPage3 = (Button)findViewById(R.id.item3_back);
        secondPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();

            }
        });
    }
    public void backActivity(){
        Intent back3 = new Intent(this,SecondPage.class);
        startActivity(back3);
        finish();
    }
}
