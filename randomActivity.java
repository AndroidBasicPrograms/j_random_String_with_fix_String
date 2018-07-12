package com.example.jayhind.audiovideoplayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class randomActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        tv=findViewById(R.id.tv);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = "";
        List<Character> tokens = new ArrayList<Character>();

        Random rand = new Random();
        String word="AFRICA";
        int len=word.length();
        char chars[]=new char[len];

        for (int i = 0; i < len; i++) {
            char c=word.charAt(i);
            tokens.add(c);
        }

        int rlen=12-len;

        for (int i = 0; i < rlen; i++) {
            char c = alphabet.charAt(rand.nextInt(26));
            tokens.add(c);
        }
        StringBuilder result = new StringBuilder();
        while(tokens.size() != 0){
            int randomPos = rand.nextInt(tokens.size());
            result.append(tokens.remove(randomPos));
        }

        tv.setText(result.toString());
        System.out.println(s);
    }
}
