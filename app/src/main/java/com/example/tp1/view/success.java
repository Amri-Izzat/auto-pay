package com.example.tp1.view;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.tp1.R;
import com.example.tp1.controler.Controler;

import java.nio.charset.Charset;
import java.util.Random;


public class success extends AppCompatActivity {

    private TextView txtResultat;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);

        init();
        txtResultat.setText(""+a());


    }

    private void init()
    {

        txtResultat=(TextView)findViewById(R.id.txtResultat);







    }
    public String a() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();



        return generatedString;
    }



}