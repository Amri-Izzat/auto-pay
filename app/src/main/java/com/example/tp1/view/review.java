package com.example.tp1.view;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import com.example.tp1.R;
import com.example.tp1.controler.HomeControler;
public class review extends AppCompatActivity {
    private EditText txtorigine;
    private EditText txtdistination;
    private Button btnJouer;
    private HomeControler homeControler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_activity);
        init();
        ecouteJouer();
    }
    private void init()
    {

        btnJouer=(Button)findViewById(R.id.btnJouer);
        this.homeControler = HomeControler.getInstance(this);
//récupération des noms de joueurs

    }
    private void ecouteJouer(){
        btnJouer.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                activiteSuivante();
            }
        });
    }
    private void savePlayers(String name1, String name2) {
        this.homeControler.createPlayers(name1,name2,this);
    }
    private void activiteSuivante()
    {
        Intent intent = new Intent(review.this, com.example.tp1.view.success.class);

        startActivity(intent);
    }
    /**
     * récupération des noms de joueurs s'ils étaient sérialisés
     */

}