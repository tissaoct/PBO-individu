package com.example.tissa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        ListView listView;
        ArrayAdapter<String> arrayAdapter;
        String[] programmingLang = {
                "Java", "Android", "C++", "C#", "Visual Basic", "Ruby", "Python", "PHP", "Lisp"
        };

        listView = findViewById(R.id.listViewProgramming);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, programmingLang);
        listView.setAdapter(arrayAdapter);
    }
}
