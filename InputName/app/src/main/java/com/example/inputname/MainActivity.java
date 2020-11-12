package com.example.inputname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputNama;
    TextView nama;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNama = (EditText)findViewById(R.id.inputNama);
        nama = (TextView)findViewById(R.id.nama);
        btnShow = (Button)findViewById(R.id.btnShow);

        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnShow){
            nama.setText(("Hai "+inputNama.getText().toString()));
        }
    }
}