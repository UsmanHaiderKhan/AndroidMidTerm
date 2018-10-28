package com.example.usmankhan.androidmidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_spinner );
        Spinner spinner = (Spinner) findViewById( R.id.spinner1 );
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource( this, R.array.spinner_items, android.R.layout.simple_spinner_item );
        arrayAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        spinner.setAdapter( arrayAdapter );
        spinner.setOnItemSelectedListener( this );
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition( position ).toString();
        Toast.makeText( parent.getContext(), "Your Select the option is :" + text, +Toast.LENGTH_SHORT ).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
