package com.example.spaceport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(listener);

    }

    View.OnClickListener listener = view -> {
        EditText t = findViewById(R.id.fuel);
        int text = Integer.parseInt(t.getText().toString());
        TextView result = findViewById(R.id.result);
        result.setText("Необходимо " + text * 40 + " литров");
    };
}