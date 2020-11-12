package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SimpleListActivity extends  AppCompatActivity{

    private ListView lv_country;
    private String[] countries = new String[]{
            "Indonesia", "Palestina", "Cina", "Korea",
            "Jepang", "Inggris", "Belanda", "Australia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        String title = getResources().getString(R.string.label_country);
        getSupportActionBar().setTitle(title);

        lv_country = findViewById(R.id.lv_country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SimpleListActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, countries);

        lv_country.setAdapter(adapter);

        lv_country.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SimpleListActivity.this, "Anda memilih: "+countries[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
