package com.example.distress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class cancel extends AppCompatActivity {
    Timer timer;
private Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel);

        timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
              Intent intent= new Intent(cancel.this,MapsActivity.class);
              startActivity(intent);
            }
        },10000);

        butt= findViewById(R.id.button2);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(cancel.this, MainActivity.class);
                startActivity(intent);


            }
        });

    }
}
