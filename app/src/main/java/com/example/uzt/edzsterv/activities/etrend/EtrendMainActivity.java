package com.example.uzt.edzsterv.activities.etrend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.uzt.edzsterv.R;

public class EtrendMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etrend_main);
    }

    public void goToEgyeniEtrend(View view) {
        startActivity(new Intent(EtrendMainActivity.this, EtrendEgyeniActivity.class));

    }

    public void goToSablonEtrend(View view) {
        startActivity(new Intent(EtrendMainActivity.this, EtrendSablonActivity.class));
    }
}
