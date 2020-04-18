package com.example.ahfe_welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item2 extends AppCompatActivity {
    Button back2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);

        back2 = (Button)findViewById(R.id.item2_back);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });
    }
    public void backActivity(){
        Intent item2 = new Intent(this,SecondPage.class);
        startActivity(item2);
        finish();
    }
}
