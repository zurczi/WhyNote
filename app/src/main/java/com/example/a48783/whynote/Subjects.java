package com.example.a48783.whynote;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Subjects extends AppCompatActivity {
    private ListView list ;
    private ArrayAdapter<String> adapter ;
    public static ArrayList<String> subjects = new ArrayList<String>() {{
        add("PR");
        add("PTC");
        add("PIT");
        add("MP");
        add("PMD");
    }};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        list = (ListView) findViewById(R.id.subjects);


        adapter = new ArrayAdapter<String>(this, R.layout.list_view_row, subjects);

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
        intent.putExtra("subject",subjects.get(i) );
        startActivity(intent);
    }

    public void addNew(View view){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Subjects.this);
        alertDialog.setTitle("Add new subject");
        alertDialog.setMessage("Enter subject name");
        final EditText input = new EditText(Subjects.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        alertDialog.setView(input);

        alertDialog.setPositiveButton("ADD",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                       String new_subject = input.getText().toString();
                                subjects.add(new_subject);
                                //adapter.add(new_subject);
                                adapter.notifyDataSetChanged();
                    }
                });

        alertDialog.setNegativeButton("CANCEL",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        alertDialog.show();
    }

}
