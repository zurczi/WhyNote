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
    String notes[] = {"PR 20.10","PTC 25.10","PIT 18.11","MP 13.11","PMD 5.10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("LUHUHUHUU");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String subject_name = extras.getString("subject");
            for(int i=0;i<5;i++){
                notes[i]=subject_name +" Number " +i;
            }
        }else{
            String [] allNotes = {"PR 20.10","PTC 25.10","PIT 18.11","MP 13.11","PMD 5.10"};
            notes=allNotes;
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_notes);

        list = (ListView) findViewById(R.id.lastnotes);

        ArrayList<String> carL = new ArrayList<String>();
        carL.addAll( Arrays.asList(notes) );

        adapter = new ArrayAdapter<String>(this, R.layout.list_view_row, carL);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showNotes(view,i);
            }
        });

    }
    public void showNotes(View view)
    {
        Intent intent = new Intent(this, Note.class);
        intent.putExtra("subject", );
        startActivity(intent);
    }
}
