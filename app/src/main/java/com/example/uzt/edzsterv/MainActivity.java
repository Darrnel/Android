package com.example.uzt.edzsterv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uzt.edzsterv.activities.edzesterv.EdzestervMainActivity;
import com.example.uzt.edzsterv.activities.etrend.EtrendMainActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToEdzesterv(View view) {

        startActivity(new Intent(MainActivity.this, EdzestervMainActivity.class));
    }

    public void goToEtrend(View view) {

        startActivity(new Intent(MainActivity.this, EtrendMainActivity.class));
    }
}
