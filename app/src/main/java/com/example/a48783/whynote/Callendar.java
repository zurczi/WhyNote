package com.example.a48783.whynote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class Callendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callendar);
    }

    public void showNotes(View view)
    {
        Intent intent = new Intent(this, LastNotes.class);
        startActivity(intent);
    }
}
