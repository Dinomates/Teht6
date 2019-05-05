package com.example.teht6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA = "msg";
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        listView.setAdapter(new ArrayAdapter<President>(
                this,
                android.R.layout.simple_list_item_1,
                PresidentSingleton.getInstance().getPresidentNames()));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, PresidentActivity.class);
                intent.putExtra(EXTRA, 1);
                startActivity(intent);
            }
        });
    }
}
