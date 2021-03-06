package com.applet.doctorfinder.doctorfinder.view;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.applet.doctorfinder.doctorfinder.R;

import java.util.ArrayList;

public class SignUpAsPatient extends AppCompatActivity {
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "DatePickerDialog");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_as_patient);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.arrow);
        View view = toolbar.getChildAt(1);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignUpGeneral.class);
                startActivity(intent);
            }
        });
    }
}
