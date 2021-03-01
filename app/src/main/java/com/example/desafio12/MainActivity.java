package com.example.desafio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    EditText votes;

    Button sendVotes;

    TextView results1, results2, results3, results4;

    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        votes = (EditText) findViewById(R.id.votes);

        sendVotes = (Button) findViewById(R.id.sendVotes);

        results1 = (TextView) findViewById(R.id.results1);
        results2 = (TextView) findViewById(R.id.results2);
        results3 = (TextView) findViewById(R.id.results3);
        results4 = (TextView) findViewById(R.id.results4);

        sendVotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String votos = votes.getText().toString();
               String[] words = votos.split("\\,", -1);

               results1.setText(words);



            }
        });

    }
}