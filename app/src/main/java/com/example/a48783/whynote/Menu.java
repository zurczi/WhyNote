package com.example.a48783.whynote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void lastNotes(View view)
    {
        Intent intent = new Intent(this, LastNotes.class);
        startActivity(intent);
    }
    public void callendar(View view)
    {
        Intent intent = new Intent(this, Callendar.class);
        startActivity(intent);
    }
    public void subjects(View view)
    {
        Intent intent = new Intent(this, Subjects.class);
        startActivity(intent);
    }
    public void newNote(View view)
    {
        Intent intent = new Intent(this, NewNote.class);
        startActivity(intent);
    }
}
