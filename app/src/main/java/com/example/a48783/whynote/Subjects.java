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

public class Subjects extends AppCompatActivity {
    private ListView list ;
    private ArrayAdapter<String> adapter ;
    String subjects[] = {"PR","PTC","PIT","MP","PMD"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        list = (ListView) findViewById(R.id.subjects);



        ArrayList<String> carL = new ArrayList<String>();
        carL.addAll( Arrays.asList(subjects) );

        adapter = new ArrayAdapter<String>(this, R.layout.list_view_row, carL);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showNotes(view,i);
            }
        });

    }
    public void showNotes(View view,int i)
    {
        Intent intent = new Intent(this, LastNotes.class);
        intent.putExtra("subject",subjects[i] );
        startActivity(intent);
    }

}
