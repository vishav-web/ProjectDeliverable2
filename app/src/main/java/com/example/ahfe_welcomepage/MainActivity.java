package com.example.ahfe_welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button_firstPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_firstPage = (Button) findViewById(R.id.button_firstPage);
        button_firstPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondPage();
            }
        });
    }
    public void openSecondPage(){
        Intent intent  = new Intent(this, SecondPage.class);
        startActivity(intent);

    }
}
