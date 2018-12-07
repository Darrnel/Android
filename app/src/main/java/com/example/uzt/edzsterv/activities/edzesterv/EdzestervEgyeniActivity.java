package com.example.uzt.edzsterv.activities.edzesterv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.uzt.edzsterv.R;
import com.example.uzt.edzsterv.modell.Edzes.Edzesterv;

public class EdzestervEgyeniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edzesterv_egyeni);
    }

    public void addGyakorlat(View view) {
    }

    public void goToKeszEdzesterv(View view) {
        //startActivity(new Intent(EdzestervEgyeniActivity.this, .class)); //TODO
    }
}
