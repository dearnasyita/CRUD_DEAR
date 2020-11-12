package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText bil1;
    EditText bil2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bil1 = findViewById(R.id.input1);
        bil2 = findViewById(R.id.input2);
        txtResult = findViewById(R.id.txt_result);

        bil1.setText("0");
        bil2.setText("0");

        Button btnAdd = findViewById(R.id.tambah);
        btnAdd.setOnClickListener((View.OnClickListener) this);

        Button btnSub = findViewById(R.id.kurang);
        btnSub.setOnClickListener((View.OnClickListener) this);

        Button btnMul = findViewById(R.id.kali);
        btnMul.setOnClickListener((View.OnClickListener) this);

        Button btnDiv = findViewById(R.id.bagi);
        btnDiv.setOnClickListener((View.OnClickListener) this);

        Button btnClear = findViewById(R.id.clear);
        btnClear.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v){
        Double val1 = Double.parseDouble(bil1.getText().toString());
        Double val2 = Double.parseDouble(bil2.getText().toString());

        if(v.getId() == R.id.tambah){
            Double res = val1 + val2;
            txtResult.setText(res+"");
        }else if(v.getId() == R.id.kurang) {
            Double res = val1 - val2;
            txtResult.setText(res + "");
        }else if (v.getId() == R.id.bagi) {
            Double res = val1 / val2;
            txtResult.setText(res + "");
        }else if (v.getId() == R.id.kali) {
            Double res = val1 * val2;
            txtResult.setText(res + "");
        }else if(v.getId() == R.id.clear) {
            bil1.setText("0");
            bil2.setText("0");
            txtResult.setText("0");
        }
    }
}