package com.example.uzt.edzsterv.activities.edzesterv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.uzt.edzsterv.R;

public class EdzestervMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edzesterv_main);
    }

    public void ttindexSzamolButton(View view) {
        //TODO
    }

    public void goToEgyeniEdzesterv(View view) {
        startActivity(new Intent(EdzestervMainActivity.this, EdzestervEgyeniActivity.class));
    }

    public void goToSablonEdzesterv(View view) {
        startActivity(new Intent(EdzestervMainActivity.this, EdzestervSablonActivity.class));
    }
}
