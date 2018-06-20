package com.blogytec.superheroguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      final EditText input = findViewById(R.id.editText);
        Button press = findViewById(R.id.button);
        final TextView output = findViewById(R.id.output);

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output.setText(input.getText().toString().trim());
                Toast.makeText(MainActivity.this,input.getText().toString().trim(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
