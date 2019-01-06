package com.example.a48783.whynote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class NewNote extends AppCompatActivity {
    ArrayList<String> items=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        for (int i=0;i<Subjects.subjects.size();i++) {
            items.add(Subjects.subjects.get(i));
        }
        Spinner spinner =(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, items);
        spinner.setAdapter(adapter);
    }
}
