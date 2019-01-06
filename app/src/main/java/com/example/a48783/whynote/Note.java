package com.example.a48783.whynote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Note extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Bundle extras = getIntent().getExtras();
        String extraNoteName = extras.getString("note_name");
        String extraSubject = extras.getString("subject");
        EditText noteName = (EditText)findViewById(R.id.editText4);
        EditText subject = (EditText)findViewById(R.id.editText6);
        noteName.setText(extraNoteName);
        subject.setText(extraSubject);
    }
}
