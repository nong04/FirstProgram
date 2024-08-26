package com.example.firstprogram;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText txtX, txtY;
    TextView txtResult;
    Button btnPlus, btnMinus, btnMultiply, btnDivide, btnModulo;

    private void innitControl() {
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtResult = findViewById(R.id.txtResult);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);
        btnPlus.setOnClickListener(view -> {
            int x = Integer.parseInt(txtX.getText().toString());
            int y = Integer.parseInt(txtY.getText().toString());
            int result = x + y;
            txtResult.setText(String.valueOf(result));
        });
        btnMinus.setOnClickListener(view -> {
            int x = Integer.parseInt(txtX.getText().toString());
            int y = Integer.parseInt(txtY.getText().toString());
            int result = x - y;
            txtResult.setText(String.valueOf(result));
        });
        btnMultiply.setOnClickListener(view -> {
            int x = Integer.parseInt(txtX.getText().toString());
            int y = Integer.parseInt(txtY.getText().toString());
            int result = x * y;
            txtResult.setText(String.valueOf(result));
        });
        btnDivide.setOnClickListener(view -> {
            int x = Integer.parseInt(txtX.getText().toString());
            int y = Integer.parseInt(txtY.getText().toString());
            int result = x / y;
            txtResult.setText(String.valueOf(result));
        });
        btnModulo.setOnClickListener(view -> {
            int x = Integer.parseInt(txtX.getText().toString());
            int y = Integer.parseInt(txtY.getText().toString());
            int result = x % y;
            txtResult.setText(String.valueOf(result));
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitControl();
    }
}