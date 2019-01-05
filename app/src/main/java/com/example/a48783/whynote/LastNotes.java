package com.example.a48783.whynote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class LastNotes extends AppCompatActivity {
    private ListView list ;
    private ArrayAdapter<String> adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_notes);

        list = (ListView) findViewById(R.id.lastnotes);

        String cars[] = {"PR 20.10","PTC 25.10","PIT 18.11","MP 13.11","PMD 5.10"};

        ArrayList<String> carL = new ArrayList<String>();
        carL.addAll( Arrays.asList(cars) );

        adapter = new ArrayAdapter<String>(this, R.layout.list_view_row, carL);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showNotes(view);
            }
        });

    }
    public void showNotes(View view)
    {
        Intent intent = new Intent(this, NewNote.class);
        startActivity(intent);
    }
}
