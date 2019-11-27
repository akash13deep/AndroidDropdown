package com.example.countrieswithcapitals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner sp,sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> country = new ArrayList<String>();
        country.add("India");   //New Delhi
        country.add("Canada");  //Ottawa
        country.add("France");  //Paris
        sp=findViewById(R.id.spinner1);

        ArrayAdapter<String> catAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,country);

        catAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        sp.setAdapter(catAdapter);
        sp.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        List<String> capital = new ArrayList<String>();
        capital.add("New Delhi");
        capital.add("Ottawa");
        capital.add("Paris");

        EditText ed = findViewById(R.id.editText);
        ed.setText(capital.get(i));

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
