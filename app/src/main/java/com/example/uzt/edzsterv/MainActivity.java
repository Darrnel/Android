package com.example.uzt.edzsterv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uzt.edzsterv.R;
import com.example.uzt.edzsterv.activities.EdzestervMainActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configuregoToEdzestervButton();

    }

    private void configuregoToEdzestervButton(){
        Button goToEdzesterButton = (Button) findViewById(R.id.goToEdzestervButton);

        goToEdzesterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EdzestervMainActivity.class));
            }
        });
    }
    public void goToEdzesterv(View view) {
    }

    public void goToEtrend(View view) {
    }
}
